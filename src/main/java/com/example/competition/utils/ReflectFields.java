package com.example.competition.utils;

import com.example.competition.dao.entity.Report;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

/**
 * @ClassName: ReflectFields
 * @Description: 反射给对对象赋值
 * @author 胡鹏鹏
 * @date 2018年1月20日 下午10:46:07
 */
public class ReflectFields {
	Report object;
	Map<String, String> map;

	public Report getFields() throws Exception, IllegalArgumentException, InvocationTargetException {
		Class<?> clz = object.getClass();
		Field[] fields = clz.getDeclaredFields();
		for (Field field : fields) {
			//得到bean 属性
			String fname=field.getName();
			//得到数据库字段名
			Method m = object.getClass().getMethod("get" + captureName(fname));
			//遍历map key
			for (String key : map.keySet()) {
				   if(key.equals(getRealName(fname))){
					   String value = map.get(key);
					   if (value != null) {
	                        m = object.getClass().getMethod("set"+captureName(fname),String.class);
	                        m.invoke(object, value);
	                    }else{
	                        m = object.getClass().getMethod("set"+captureName(fname),String.class);
	                        m.invoke(object, "");
	                    }
				   }
				  }
			
			
		}
		return  object;
	}

	public ReflectFields(Report object, Map<String, String> map) {
		super();
		this.object = object;
		this.map = map;
	}

	public static void main(String[] args) throws Exception, InvocationTargetException, Exception {
		Report  report = new Report();
		ReflectFields reflectFields = new ReflectFields(report, null);
		reflectFields.getFields();
	}
	/** 
	 * @Title: getRealName 
	 * @Description: 得到数据库字段 
	 * @param @param fname
	 * @param @return
	 * @return String    
	 * @throws 
	 */
	public static String getRealName(String fname){
		if("mainStudentQq".equals(fname)){
			return "main_student_QQ";
		}
		if("student1Qq".equals(fname)){
			return "student1_QQ";
		}
		if("student2Qq".equals(fname)){
			return "student2_QQ";
		}
		if("teacherQq".equals(fname)){
			return "teacher_QQ";
		}

		StringBuffer buffer=new StringBuffer();
		// 得到大写字母
		for(int i = 0; i < fname.length() ; i++){
			String a=String.valueOf(fname.charAt(i));
			//判断大写
			if(Character.isUpperCase(fname.charAt(i))){
				char c = fname.charAt(i);
				a="_"+(Character.toLowerCase(c));
			}
			buffer.append(a);
		}
		return buffer.toString();
	}
	public static String captureName(String name) {
		name = name.substring(0, 1).toUpperCase() + name.substring(1);
		return  name;

	}
}
