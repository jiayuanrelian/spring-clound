package com.yuantong.jwt;

import com.yuantong.jwt.utils.JWTUtils;
import org.junit.Test;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertTrue;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    @SuppressWarnings("unchecked")
    public void test1() {
        // 正常生成token----------------------------------------------------------------------------------------------------
        String token = null;
        Map<String, Object> payload = new HashMap<String, Object>();
        Date date = new Date();
        payload.put("uid", "291969452");// 用户id
        payload.put("iat", date.getTime());// 生成时间:当前
        payload.put("ext", date.getTime() + 2000 * 60 * 60);// 过期时间2小时
        token = JWTUtils.createToken(payload);
        System.out.println("新生成的token是：" + token+"\n马上将该token进行校验");
        Map<String, Object> resultMap = JWTUtils.validToken(token);
        System.out.println("校验结果是:" + getResult((String)resultMap.get("state")) );
        HashMap<String,String> dataobj =  (HashMap<String,String>) resultMap.get("data");
        System.out.println("从token中取出的payload数据是：" +dataobj.toString());

    }

    public void test2() {
        // 校验过期----------------------------------------------------------------------------------------------------
        String token = null;
        Map<String, Object> payload = new HashMap<String, Object>();
        Date date = new Date();
        payload.put("uid", "291969452");// 用户id
        payload.put("iat", date.getTime());// 生成时间
        payload.put("ext", date.getTime());// 过期时间就是当前
        token = JWTUtils.createToken(payload);
        System.out.println("新生成的token是：" + token+"\n马上将该token进行校验");
        Map<String, Object> resultMap = JWTUtils.validToken(token);
        System.out.println("校验结果是:" + getResult((String)resultMap.get("state")) );

    }

    @SuppressWarnings("unchecked")
    public void test2_1() {
        // 不校验过期（当payload中无过期ext字段时）----------------------------------------------------------------------------------------------------
        String token = null;
        Map<String, Object> payload = new HashMap<String, Object>();
        Date date = new Date();
        payload.put("uid", "291969452");// 用户id
        payload.put("iat", date.getTime());// 生成时间
        token = JWTUtils.createToken(payload);
        System.out.println("新生成的token是：" + token+"\n马上将该token进行校验");
        Map<String, Object> resultMap = JWTUtils.validToken(token);
        System.out.println("校验结果是:" + getResult((String)resultMap.get("state")) );
        HashMap<String,String> dataobj =  (HashMap<String,String>) resultMap.get("data");
        System.out.println("从token中取出的payload数据是：" +dataobj.toString());

    }

    public void test3() {
        // 校验非法token的情况----------------------------------------------------------------------------------------------------
        String token = null;
        Map<String, Object> payload = new HashMap<String, Object>();
        Date date = new Date();
        payload.put("uid", "291969452");// 用户id
        payload.put("iat", date.getTime());// 生成时间
        payload.put("ext", date.getTime());// 过期时间就是当前

        token = JWTUtils.createToken(payload);
        System.out.println("新生成的token是：" + token);
        System.out.println("将新生成的token加点调料再来进行校验");
        token = token + "YouAreSB";
        Map<String, Object> resultMap = JWTUtils.validToken(token);
        System.out.println("校验结果是:" + getResult((String)resultMap.get("state")) );
        System.out.println("原因是（非法token，payload参数可能经过中间人篡改，或者别人伪造的token）" );

    }

    public void test4() {
        // 校验异常的情况----------------------------------------------------------------------------------------------------
        String token = "123";
        System.out.println("我胡乱传一个token：" + token);
        Map<String, Object> resultMap = JWTUtils.validToken(token);
        System.out.println("校验结果是:" + getResult((String)resultMap.get("state")) );
        System.out.println("原因是（token格式不合法导致的程序异常）");

    }


    public String getResult(String state) {
        switch (TokenState.getTokenState(state)) {
            case VALID:
                //To do somethings
                state = "有效token";
                break;
            case EXPIRED:
                state = "过期token";
                break;
            case INVALID:
                state = "无效的token";
                break;
        }
        return state;
    }

}
