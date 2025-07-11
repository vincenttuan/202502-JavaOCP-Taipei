package day25;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.RowSorter;
import javax.swing.SortOrder;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class BMIJFrame extends JFrame {
	// 定義要用的 UI 元件
	private JLabel jLabelHeight, jLabelWeight, jLabelResult, jLabelDiag; 
	private JTextField jTextFieldHeight, jTextFieldWeight;
	private JButton jButtonCalc, jButtonClear;
	private JTable jTable;
	private DefaultTableModel model; // 資料擺放規則
	
	public BMIJFrame() {
		init();
	}
	
	// 初始配置
	private void init() {
		setTitle("BMI 計算機");
		setSize(600, 350); // 設定視窗大小(寬度, 高度)
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 按下視窗上方的"X"可以結束程式
		setLocationRelativeTo(null); // 視窗置中
		
		// 設定版面配置 FlowLayout (元件會依序排在每一個元件的後面, 若視窗空間不足才會換行)
		setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));
		
		// 建立元件
		jLabelHeight = new JLabel("身高(cm):");
		jLabelWeight = new JLabel("體重(kg):");
		jLabelResult = new JLabel("BMI:");
		jLabelDiag = new JLabel("診斷:");
		jTextFieldHeight = new JTextField(5); // 5個字的空間
		jTextFieldWeight = new JTextField(5); // 5個字的空間
		jButtonCalc = new JButton("計算");
		jButtonClear = new JButton("清空");
		
		// JTable 設定
		String[] columnsNames = {"身高(cm)", "體重(kg)", "BMI", "診斷"};
		model = new DefaultTableModel(columnsNames, 0); // 初始筆數 0 筆 
		jTable = new JTable(model);
		jTable.setFillsViewportHeight(true); // 當資料行數不足時, 表格背景仍填滿整個可視視窗
		// JTable 在滾動面板(JScrollPane) 中的可視大小
		jTable.setPreferredScrollableViewportSize(new Dimension(560, 230)); 
		// 支援欄位排序
		TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(model);
		sorter.setSortable(3, false); // 診斷欄位不提供排序功能
		jTable.setRowSorter(sorter);
		
		JScrollPane scrollPane = new JScrollPane(jTable);
		
		// 配置元件到 JFrame 畫面上
		add(jLabelHeight);     // 身高標籤
		add(jTextFieldHeight); // 身高輸入框
		add(jLabelWeight);     // 體重標籤輸入框
		add(jTextFieldWeight); // 體重輸入框
		add(jButtonCalc);      // 計算按鈕
		add(jButtonClear);     // 清空按鈕
		add(jLabelResult);     // 計算標籤結果
		add(jLabelDiag);       // 診斷標籤
		add(scrollPane);
		
		// 按下計算按鈕
		jButtonCalc.addActionListener((e) -> calcBMI());
		
		// 按下清空按鈕
		jButtonClear.addActionListener((e) -> model.setRowCount(0));
		
		// 預設加入 20 筆資料
		for(int i=0;i<20;i++) {
			double h = 150 + Math.random() * 50; // 150~200cm
			double w = 40 + Math.random() * 60; // 40~100kg
			double bmiValue = w / Math.pow(h/100, 2);
			String diag = (bmiValue <= 18) ? "過輕" : (bmiValue > 23) ? "過重" : "正常";
			// 新增資料到 JTable
			model.addRow(new Object[] {
					String.format("%.1f", h),
					String.format("%.1f", w),
					String.format("%.2f", bmiValue),
					String.format("%s", diag),
			});
		}
		
	}
	
	private void calcBMI() {
		double h = 0;
		try {
			h = Double.parseDouble(jTextFieldHeight.getText()); // 取得使用者在身高欄位所輸入的資料並轉成 double
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(this, "身高請輸入數字", "錯誤", JOptionPane.ERROR_MESSAGE);
			return;
		}
		
		double w = 0;
		try {
			w = Double.parseDouble(jTextFieldWeight.getText()); // 取得使用者在體重欄位所輸入的資料並轉成 double
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(this, "體重請輸入數字", "錯誤", JOptionPane.ERROR_MESSAGE);
			return;
		}
		double bmiValue = w / Math.pow(h/100, 2);
		
		jLabelResult.setText(String.format("BMI: %.2f", bmiValue));
		String diag = null;
		Color diagColor = null;
		if(bmiValue <= 18) {
			diag = "過輕";
			diagColor = Color.RED;
		} else if(bmiValue > 23) {
			diag = "過重";
			diagColor = Color.RED;
		} else {
			diag = "正常";
			//jLabelDiag.setForeground(new Color(0x005100));
			diagColor = Color.BLUE;
		}
		jLabelDiag.setText(diag);
		jLabelDiag.setForeground(diagColor);
		jLabelDiag.setFont(new Font("標楷體", Font.BOLD, 20));
		
		// 新增資料到 JTable
		model.addRow(new Object[] {
				String.format("%.1f", h),
				String.format("%.1f", w),
				String.format("%.2f", bmiValue),
				String.format("%s", diag),
		});
		
		
	}
	
	// 主程式
	public static void main(String[] args) {
		// 啟動視窗
		SwingUtilities.invokeLater(() -> new BMIJFrame().setVisible(true));
	}
	
}
