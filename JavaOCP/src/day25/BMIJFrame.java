package day25;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

public class BMIJFrame extends JFrame {
	// 定義要用的 UI 元件
	private JLabel jLabelHeight, jLabelWeight, jLabelResult, jLabelDiag; 
	private JTextField jTextFieldHeight, jTextFieldWeight;
	private JButton jButtonCalc;
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
		
		// JTable 設定
		String[] columnsNames = {"身高(cm)", "體重(kg)", "BMI", "診斷"};
		model = new DefaultTableModel(columnsNames, 0); // 初始筆數 0 筆 
		jTable = new JTable(model);
		jTable.setFillsViewportHeight(true);
		jTable.setPreferredScrollableViewportSize(new Dimension(560, 230));
		JScrollPane scrollPane = new JScrollPane(jTable);
		
		
		// 配置元件到 JFrame 畫面上
		add(jLabelHeight);     // 身高標籤
		add(jTextFieldHeight); // 身高輸入框
		add(jLabelWeight);     // 體重標籤輸入框
		add(jTextFieldWeight); // 體重輸入框
		add(jButtonCalc);      // 計算按鈕
		add(jLabelResult);     // 計算標籤結果
		add(jLabelDiag);       // 診斷標籤
		add(scrollPane);
		
		// 按下計算按鈕
		jButtonCalc.addActionListener((e) -> calcBMI());
	}
	
	private void calcBMI() {
		double h = Double.parseDouble(jTextFieldHeight.getText()); // 取得使用者在身高欄位所輸入的資料並轉成 double
		double w = Double.parseDouble(jTextFieldWeight.getText()); // 取得使用者在體重欄位所輸入的資料並轉成 double
		double bmiValue = w / Math.pow(h/100, 2);
		
		jLabelResult.setText(String.format("BMI: %.2f", bmiValue));
		
		if(bmiValue <= 18) {
			jLabelDiag.setText("過輕");
			jLabelDiag.setForeground(Color.RED);
		} else if(bmiValue > 23) {
			jLabelDiag.setText("過重");
			jLabelDiag.setForeground(Color.RED);
		} else {
			jLabelDiag.setText("正常");
			//jLabelDiag.setForeground(new Color(0x005100));
			jLabelDiag.setForeground(Color.BLUE);
		}
		jLabelDiag.setFont(new Font("標楷體", Font.BOLD, 20));
	}
	
	// 主程式
	public static void main(String[] args) {
		// 啟動視窗
		SwingUtilities.invokeLater(() -> new BMIJFrame().setVisible(true));
	}
	
}
