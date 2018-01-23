package com.example.competition.utils;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @作者：刘富国
 * @创建时间：2018/1/20 18:32
 */
public class Md5UtilTest {

    @Test
    public void toMd5() {
        System.out.println(Md5Util.toMd5("123456"));
    }
}