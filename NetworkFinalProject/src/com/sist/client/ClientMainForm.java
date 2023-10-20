package com.sist.client;
import javax.swing.*;

import com.sist.common.ImageChange;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/*
		FlowLayout : JPanel (버튼을 일자로)
			------------
			 버튼	버튼..
			------------
		GridLayout (버튼을 일정 간격으로 ex) 계산기)
			------------
			버튼 버튼 버튼
			버튼 버튼 버튼
			------------
		BorderLayout : JFrame (가장자리 배치)
			------------
				North
			------------
				|	|
			East|	| West
				|	|
				Center
			------------
				South
			------------
		CardLayout : 감췄다 클릭하면 원하는 창
 */
public class ClientMainForm extends JFrame implements ActionListener {
	MenuPanel mp=new MenuPanel();
	ControlPanel cp=new ControlPanel();
	JLabel logo=new JLabel();
	Login login=new Login();
	public ClientMainForm()
	{
		setLayout(null); // 직접 배치
		logo.setBounds(15, 15, 100, 150);
		logo.setIcon(new ImageIcon(ImageChange.getImage(new ImageIcon("c:\\javaDev\\logo.jpg"), 100, 100)));
		add(logo);
		mp.setBounds(15, 200, 100, 250); // 메뉴의 버튼 크기
		add(mp);
		cp.setBounds(135, 15, 865, 710);
		add(cp);
		setSize(1025, 768);
		//setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE); // 안주면 계속 살아있음
		setResizable(false);
		// 등록
		mp.b1.addActionListener(this);
		mp.b2.addActionListener(this);
		mp.b3.addActionListener(this);
		mp.b4.addActionListener(this);
		mp.b5.addActionListener(this);
		mp.b6.addActionListener(this);
		
		login.b1.addActionListener(this);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
		}catch(Exception ex) {}
		new ClientMainForm();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==mp.b1)
		{
			cp.card.show(cp, "home");
		}
		else if(e.getSource()==mp.b2)
		{
			cp.card.show(cp, "search");
		}
		else if(e.getSource()==mp.b3)
		{
			cp.card.show(cp, "chat");
		}
		else if(e.getSource()==mp.b4)
		{
			cp.card.show(cp, "board");
		}
		else if(e.getSource()==mp.b5)
		{
			cp.card.show(cp, "news");
		}
		else if(e.getSource()==mp.b6)
		{
			System.exit(0);
		}
		else if(e.getSource()==login.b1)
		{
			// 서버연결
			login.setVisible(false);
			setVisible(true);
			
		}
	}

}
