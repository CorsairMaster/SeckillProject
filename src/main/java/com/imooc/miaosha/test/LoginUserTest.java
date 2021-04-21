package com.imooc.miaosha.test;

import com.imooc.miaosha.util.MD5Util;

import java.util.Arrays;

public class LoginUserTest {
    public static void main(String[] args) {
//        String username = "admin";
//        String password = "2f8adf02a137291e8bd7119a9f1bb3c3";
//        String salt = "haA78Xgy";
//        String s = MD5Util.formPassToDBPass(password, salt);
//        // 2cfbc2da10c5785a6f3e2d640485017d
//        System.out.println(s);
////        testhtmlMd5();

		try {
//			new LoginUserTest().testMulitthreading();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

    private static void testhtmlMd5() {
        String salt = "1a2b3c4d";
        String s1 = ""+salt.charAt(0)+salt.charAt(2) + "admin666" +salt.charAt(5) + salt.charAt(4);
        // 2f8adf02a137291e8bd7119a9f1bb3c3
        String s = MD5Util.md5(s1);
        System.out.println(s);
    }


//    public void testMulitthreading() throws Exception{
////			Runnable thread = ()->{
////				System.out.println("线程 " + Thread.currentThread().getName() + "执行了");
////			};
////    	new Thread(thread,"线程1").start();
////    	new Thread(thread,"线程2").start();
////    	new Thread(thread,"线程3").start();
////
////		System.out.println("完成");
//        boolean b = Arrays.asList(1, 2, 3).stream().anyMatch(a -> a.equals(1));
//    }



}
