package day25;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class BMIJFrame extends JFrame {
	// 定義要用的 UI 元件
	private JLabel jLabelHeight, jLabelWeight, jLabelResult; 
	private JTextField jTextFieldHeight, jTextFieldWeight;
	private JButton jButtonCalc;
	
	public BMIJFrame() {
		init();
	}
	
	// 初始配置
	private void init() {
		setTitle("BMI 計算機");
		setSize(300, 123); // 設定視窗大小(寬度, 高度)
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 按下視窗上方的"X"可以結束程式
		setLocationRelativeTo(null); // 視窗置中
		
		// 設定版面配置 FlowLayout (元件會依序排在每一個元件的後面, 若視窗空間不足才會換行)
		setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));
		
		// 建立元件
		jLabelHeight = new JLabel("身高(cm):");
		jLabelWeight = new JLabel("體重(kg):");
		jLabelResult = new JLabel("BMI:");
		jTextFieldHeight = new JTextField(5); // 5個字的空間
		jTextFieldWeight = new JTextField(5); // 5個字的空間
		jButtonCalc = new JButton("計算");
		
		// 配置元件到 JFrame 畫面上
		add(jLabelHeight);     // 身高標籤
		add(jTextFieldHeight); // 身高輸入框
		add(jLabelWeight);     // 體重標籤輸入框
		add(jTextFieldWeight); // 體重輸入框
		add(jButtonCalc);      // 計算按鈕
		add(jLabelResult);     // 計算標籤結果
		
	}
	
	// 主程式
	public static void main(String[] args) {
		// 啟動視窗
		SwingUtilities.invokeLater(() -> new BMIJFrame().setVisible(true));
	}
	
}
