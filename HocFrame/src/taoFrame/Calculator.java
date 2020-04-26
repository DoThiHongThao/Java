package taoFrame;

import java.awt.*;
import java.awt.event.*;
class Calculator{
	public static void main(String[] args){
		createMenu();
	}
	private static void createMenu(){
		// Tao Frame ung dung
		final Frame fr = new Frame();
		fr.setLayout(new BorderLayout());
		// Tao cac menu bar
		MenuBar menu = new MenuBar();
		Menu menuFile = new Menu("Edit");
		MenuItem copyItem = new MenuItem("Copy Ctrl+C");
		MenuItem pasteItem = new MenuItem("Paste Ctrl+V");
		menuFile.add(copyItem);
		menuFile.add(pasteItem);
		Menu menuHelp = new Menu("Help");
		MenuItem hTopicItem = new MenuItem("Help Topics");
		MenuItem hAboutItem = new MenuItem("About Calculator");
		menuHelp.add(hTopicItem);
		menuHelp.addSeparator();
		menuHelp.add(hAboutItem);
		menu.add(menuFile);
		menu.add(menuHelp);
		fr.setMenuBar(menu);
		fr.setBounds(100, 100, 300, 200);
		fr.setTitle("Calculator");
		//fr.setResizable(false);
		fr.setVisible(true);
		// xử lý biến sự kiện đóng cửa số ứng dụng.
		fr.addWindowListener(
				new WindowAdapter(){
					public void windowClosing(WindowEvent e){
						System.exit(0);
					}
				});
		}
}
