package com.sist.client;
import java.awt.CardLayout;

import javax.swing.*;
public class ControlPanel extends JPanel{
	public HomePanel hp=new HomePanel();
	public ChatPanel cp=new ChatPanel();
	public BoardListPanel blp=new BoardListPanel();
	public NewsPanel np=new NewsPanel();
	public SearchPanel sp=new SearchPanel();
	
	public CardLayout card=new CardLayout();
	public ControlPanel()
	{
		setLayout(card);
		add("home",hp);
		add("chat",cp);
		add("board",blp);
		add("news",np);
		add("search",sp);
	}

}
