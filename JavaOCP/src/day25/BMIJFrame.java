package day25;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class BMIJFrame extends JFrame {
	
	public BMIJFrame() {
		init();
	}
	
	// 初始配置
	private void init() {
		setTitle("BMI 計算機");
		setSize(300, 123); // 設定視窗大小(寬度, 高度)
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 按下視窗上方的"X"可以結束程式
		setLocationRelativeTo(null); // 置中
	}
	
	// 主程式
	public static void main(String[] args) {
		// 啟動視窗
		SwingUtilities.invokeLater(() -> new BMIJFrame().setVisible(true));
	}
	
}
