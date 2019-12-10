package cn.itcast.application;

import java.util.Scanner;

public class Bank {

	int account;
	private static User user;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Bank b=new Bank();
        b.login();
        b.operate();
	}

	public void operate() {
		Bank b=new Bank();
		while(true) {
			System.out.println("请输入您要进行的操作类型，按回车键结束");
			System.out.println("存款：1" + "\t" + "取款：2" + "\t" + "余额：3" + "\t" + "退出：0");
			Scanner in=new Scanner(System.in);
			String s=in.nextLine();
			if("1".equals(s)||"2".equals(s)) {
				int num=0;
				try {
					System.out.println("输入存取的金额：");
					num=Integer.parseInt(in.nextLine());
				}catch(Exception e) {
					System.out.println("金额输入错误！");
					continue;
				}
				switch(s) {
				case"1":
					b.income(num);
					break;
		break		case"2":
					b.takeout(num);
					;
				}
			}else if("3".equals(s)) {
				b.show();
			}else if("0".equals(s)) {
				System.out.println("退出系统！");
				return;
			}else {
				System.out.println("请输入0~3之间的数字选择相关操作！");
			}
		}
	}
	
	public viod login() {
		DBUtil dbutil=DBUtil.getIntance();
		System.out.println("欢迎进入网上银行系统！");
		while(true) {
			Scanner in=new Scanner(System.in);
			System.out.println("请输入银行卡卡号：");
			String cardId=in.nextLine();
			System.out.println("请输入银行卡密码：");
			String cardPwd=in.nextLine();
			user=dbtil.getUser(cardPwd);
			
			if(dbtil.getUsers().containKey(cardId)&&user.getcardPwd().equals(cardPwd)) {
				System.out.println("登录成功！欢迎"+user.getUserName()"先生");
				break;
			}else {
				System.out.println("银行卡号或密码错误！");
				continue;
			}
		}
	}
	public void takeout(int num) {
		
	}
}
