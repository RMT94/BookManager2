package Book.Login;

import Book.Bookapp;
import Book.Member.MemberCenter;
import Book.Member.Members;

/**
 * 로그인 통제
 */
public class LoginCenter {

    LoginInfo loginInfo=new LoginInfo();
    MemberCenter mc;

    public LoginCenter(MemberCenter mc){
        this.mc=mc;
    }

    //로그인 여부를 넘겨준다.
    public boolean isLogin(){
        return loginInfo.isLogin();
    }

    //로그인 정보를 넘겨준다.
    public LoginInfo getLoginInfo(){
        return loginInfo;
    }

    //로그인이 되게 한다.
    public boolean login(String id,String pw){
        // 회원장부를 가져온다.
        //장부랑 id랑 비교해서 없으면 실패(고유한값)
        Members member =mc.findByID(id);
        if(member==null){
            return false;
        }
        //장부랑 pw랑 비교해서 틀리면 실패
        if(!member.getPw().equals(pw)){
            return false;
        }
        //로그인성공의 권한부여
        loginInfo.setLogin(true);
        loginInfo.setLoginId(id);
        return true;
    }
}