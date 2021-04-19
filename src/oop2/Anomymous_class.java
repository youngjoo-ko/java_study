package oop2;

import java.awt.*;
import java.awt.event.*;


public class Anomymous_class {
	public static void main(String[] args) {
		Button b = new Button("start");
		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("ActionEvent occurred");
			}
		}); // 익명클래스 끝
	} // main 끝
}
