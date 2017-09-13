package com.ceshi.test;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.UUID;

import javax.imageio.stream.FileImageInputStream;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ceshi.bean.Department;
import com.ceshi.bean.Employee;
import com.ceshi.bean.Go_kind;
import com.ceshi.bean.Go_paytype;
import com.ceshi.bean.Go_picture;
import com.ceshi.bean.Go_pictureWithBLOBs;
import com.ceshi.bean.Good;
import com.ceshi.bean.Me_address;
import com.ceshi.bean.Member;
import com.ceshi.bean.MemberExample;
import com.ceshi.bean.MemberExample.Criteria;
import com.ceshi.bean.Myorder;
import com.ceshi.bean.MyorderExample;
import com.ceshi.bean.Or_good;
import com.ceshi.dao.AdministratorMapper;
import com.ceshi.dao.DepartmentMapper;
import com.ceshi.dao.EmployeeMapper;
import com.ceshi.dao.Go_kindMapper;
import com.ceshi.dao.Go_paytypeMapper;
import com.ceshi.dao.Go_pictureMapper;
import com.ceshi.dao.GoodMapper;
import com.ceshi.dao.Me_addressMapper;
import com.ceshi.dao.MemberMapper;
import com.ceshi.dao.MyorderMapper;
import com.ceshi.dao.Or_goodMapper;

/**
 * 测试daon层的工作
 * @author dhj
 *推荐Spring的项目就可以使用spring的单元测试，可以自动注入我们需要的组件
 *1、导入SpringTest模块
 *2、@ContextConfiguration指定Spring配置文件的位置
 *3、直接autowired要使用的组件及开发
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class MapperTest {
	
//	@Autowired
//	DepartmentMapper department;
//	
//	
//	@Autowired
//	EmployeeMapper employeeMapper;
//	
//	@Autowired
//	AdministratorMapper administratorMapper;
	
	
	@Autowired
	GoodMapper goodMapper;
	
	@Autowired
	Go_kindMapper go_kindMapper;
	
	
	@Autowired
	Go_paytypeMapper go_paytypeMapper;
	
	@Autowired
	Go_pictureMapper go_pictureMapper;
	
	@Autowired
	MyorderMapper myorderMapper;
	
	@Autowired
	Or_goodMapper or_goodMapper;
	
	@Autowired
	SqlSession sqlSession;
	
	@Autowired
	MemberMapper memberMapper;
	
	
	@Autowired
	Me_addressMapper me_addressMapper;
	
	
	public List<Date> getBetweenDates(Date start, Date end) {
	    List<Date> result = new ArrayList<Date>();
	    Calendar tempStart = Calendar.getInstance();
	    tempStart.setTime(start);
	    tempStart.add(Calendar.DAY_OF_YEAR, 1);
	    
	    Calendar tempEnd = Calendar.getInstance();
	    tempEnd.setTime(end);
	    while (tempStart.before(tempEnd)) {
	        result.add(tempStart.getTime());
	        tempStart.add(Calendar.DAY_OF_YEAR, 1);
	    }
	    return result;
	}
	
	@Test
	public void getOrderType() throws ParseException{
		

		
//		String date1 = "2017-08-02";
//		String date2 = "2017-09-05";
//		SimpleDateFormat formatter = new SimpleDateFormat( "yyyy-MM-dd");
//		Date date01 =  formatter.parse(date1);
//		Date date02 =  formatter.parse(date2);
////		System.out.println(getBetweenDates(date01,date02));
//		List<Date> list = getBetweenDates(date01,date02);
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i));
//		}
//		System.out.println(date01);
//		System.out.println(date02);
		
//		 String sourceStr = "1,2,3,4,5";
//	        String[] sourceStrArray = sourceStr.split(",");
//		 // 最多分割出3个字符串
//        int maxSplit = 2;
//        sourceStrArray = sourceStr.split(",", maxSplit);
//        for (int i = 0; i < sourceStrArray.length; i++) {
//            System.out.println(sourceStrArray[i]);
//        }
        
		/*
		 * 普通订单
		 */
//		MyorderExample example = new MyorderExample();
//		com.ceshi.bean.MyorderExample.Criteria criteria = example.createCriteria();
//		criteria.andOrTypeEqualTo(2);
//		long l = myorderMapper.countByExample(example);
//		System.out.println(l);
		
		/*
		 * 补差换购订单
		 */
//		MyorderExample example = new MyorderExample();
//		com.ceshi.bean.MyorderExample.Criteria criteria = example.createCriteria();
//		criteria.andOrTypeEqualTo(1);
//		criteria.andOrCostmoneyNotEqualTo(0.0);
//		long l = myorderMapper.countByExample(example);
//		System.out.println(l);
		
		
		/*
		 * 0元换购订单
		 */
//		MyorderExample example = new MyorderExample();
//		com.ceshi.bean.MyorderExample.Criteria criteria = example.createCriteria();
//		criteria.andOrTypeEqualTo(1);
//		criteria.andOrCostmoneyEqualTo(0.0);
//		long l = myorderMapper.countByExample(example);
//		System.out.println(l);
	}
	
	
	@Test
	public void testOrderCRUD() throws ParseException{
		/**
		 * 插入订单100条
		 */
		for (int i = 0; i < 46; i++) {
			String date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());//得当前系统时间
			myorderMapper.insert(new Myorder(null,2,19.9,date,1,1,1,null,null,3,date,date,4,200,1));//插入订单
			List<Myorder> list = myorderMapper.selectByExample(null);
			or_goodMapper.insertSelective(new Or_good(null,list.get(list.size()-1).getOrId(),1002,3,5));//插入订单商品表
		}
		for (int i = 0; i < 23; i++) {
			String date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());//得当前系统时间
			myorderMapper.insert(new Myorder(null,2,0.0,date,1,1,1,null,null,3,date,date,4,500,1));//插入订单
			List<Myorder> list = myorderMapper.selectByExample(null);
			or_goodMapper.insertSelective(new Or_good(null,list.get(list.size()-1).getOrId(),1002,3,5));//插入订单商品表
		}
		for (int i = 0; i < 33; i++) {
			String date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());//得当前系统时间
			myorderMapper.insert(new Myorder(null,2,199.9,date,1,1,1,null,null,3,date,date,4,null,2));//插入订单
			List<Myorder> list = myorderMapper.selectByExample(null);
			or_goodMapper.insertSelective(new Or_good(null,list.get(list.size()-1).getOrId(),1002,3,5));//插入订单商品表
		}
		
	
		
		
		
		//Date date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse("2017-9-3 23:20:53");
//		System.out.println(date);
//		String DateStr1 = "2011-10-1 10:20:16";
//		String DateStr2 = "2011-10-07 15:50:35";
//		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//		Date dateTime1 = dateFormat.parse(DateStr1);
//		Date dateTime2 = dateFormat.parse(DateStr2);
//		int i = dateTime1.compareTo(dateTime2); 
//		System.out.println(i);
		
		//1、先得到当前系统的时间，yyyy-MM-dd
		//2、模糊查询匹配yyyy-MM-dd %
		
//		Date dNow = new Date();   //当前时间
//		Date dBefore1 = new Date();
//		Date dBefore2 = new Date();
//		Date dBefore3 = new Date();
//		Date dBefore4 = new Date();
//		Date dBefore5 = new Date();
//		Date dBefore6 = new Date();
//		String date = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
//
//		
//		dBefore1 = getDate(dNow,-1);
//		dBefore2 = getDate(dNow,-2);
//		dBefore3 = getDate(dNow,-3);
//		dBefore4 = getDate(dNow,-4);
//		dBefore5 = getDate(dNow,-5);
//		dBefore6 = getDate(dNow,-6);
//		
//		System.out.println(date);
//		System.out.println(new SimpleDateFormat("yyyy-MM-dd").format(dNow));
//		System.out.println(new SimpleDateFormat("yyyy-MM-dd").format(dBefore1));
//		System.out.println(new SimpleDateFormat("yyyy-MM-dd").format(dBefore2));
//		System.out.println(new SimpleDateFormat("yyyy-MM-dd").format(dBefore3));
//		System.out.println(new SimpleDateFormat("yyyy-MM-dd").format(dBefore4));
//		System.out.println(new SimpleDateFormat("yyyy-MM-dd").format(dBefore5));
//		System.out.println(new SimpleDateFormat("yyyy-MM-dd").format(dBefore6));
		
		
//		MyorderExample example = new MyorderExample();
//		com.ceshi.bean.MyorderExample.Criteria criteria = example.createCriteria();
//		criteria.andOrTypeEqualTo(2);
//		criteria.andOrDateLike("2017-09-01%");
//		long h = myorderMapper.countByExample(example);
//		System.out.println(h);
		
	
	}
	
	
	public static Date getDate(Date date,int ff){
		Date dBefore = new Date();
		Calendar calendar = Calendar.getInstance();  //得到日历
		calendar.setTime(date);//把当前时间赋给日历
		calendar.add(Calendar.DAY_OF_MONTH, ff);  //设置为前几天
		dBefore = calendar.getTime();   //得到前几天的时间
		return dBefore;
	}
	
	
	
	@Test
	public void testMemberCRUD(){
//		MemberExample example = new MemberExample();
//		Criteria criteria = example.createCriteria();
//		criteria.andMeNicknameEqualTo("dhj");
//		List<Member> member = memberMapper.selectByExampleWithLevel(example);
//		
//		//遍历一个对象的每个属性值 
//		Field[] fields=member.get(0).getClass().getDeclaredFields();//拿到数据成员
//		Method[] methods=member.get(0).getClass().getMethods();//拿到函数成员
//		
//		System.out.println(fields.length);
//		System.out.println(methods.length);
//		for(Field f : fields){
//			System.out.println("该类的内部变量有:"+f.getName());
//		}
//		
//		for(Method m : methods) {
//			System.out.println("该类的方法有:"+m.getName());
//		}
		
		
		//System.out.println(member.get(0).getClass());
		
		
//		List<Member> member = memberMapper.selectByExample(null);//得到全部会员
//		int memberId = member.get(member.size()-1).getMeId();
//		me_addressMapper.insertSelective(new Me_address(null,memberId,"邓海京","13005666711","茂名","广东石油化工学院","525440",null));
		
		/*
		 * 插入100条会员信息
		 */
		
		for (int i = 0; i < 100; i++) {
			String uid = UUID.randomUUID().toString().substring(0, 5);
			String date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
			memberMapper.insertSelective(new Member(null, null, null, uid, "M", "250"+uid+"@qq.com", date, date, null, null, uid+"nickname", getOrderNo(), null, null, "123", null, 1));
//			memberMapper.insert(new Member(date, uid, 123, mePhone, meLevelid));
		}
		
		
		//System.out.println(getOrderNo());
		
	}
	
	public static  String getOrderNo(){
	    String orderNo = "" ;
//	 UUID uuid = UUID.randomUUID();
	 //String trandNo = String.valueOf((Math.random() * 9 + 1) * 1000000);
	    String sdf = new SimpleDateFormat("yyyyMMddHHMMSS").format(new Date());
	    orderNo = sdf.toString().substring(3,14);
	   // orderNo = orderNo + sdf ;
	    return orderNo ;
	}
	
	@Test
	public void testGoodCRUD(){
		
		/**
		 * 商品good表多表数据的操作
		 */
//		GoodMapper mapper =  sqlSession.getMapper(GoodMapper.class);
//		String[] goodType = {"食品","家电","手机数码","女装","男装","鞋靴","箱包","内衣配饰","百货","家居家纺"};
//		Random random=new Random();
//		for(int i=0;i<1000;i++){
//			int tag=random.nextInt(10);
//			String goType = goodType[tag];
//			String goName = "某"+goodType[tag]+i;
//			int buySum=random.nextInt(100000);
//			mapper.insertSelective(new Good(null,goType,goName,null,buySum,null));
//		}
//		System.out.println("添加1000商品完成");
		
		
		
		
		/**
		 * 多表插入
		 */
		goodMapper.insertSelective(new Good(null,"女装","某品牌女装2",null,null,null));//good表插入，商品类型+商品名称 +库存量
		
		List<Good> good = goodMapper.selectByExample(null);//得到全部商品
		int goodId = good.get(good.size()-1).getGoId();//得到最新添加的一个商品id
		go_kindMapper.insertSelective(new Go_kind(null,goodId,"黑色s码",99.9,199.9,null,50.0));//go_kind表插入  ,规格名称+原价+现价
		
		String date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());//得当前系统时间
		go_paytypeMapper.insertSelective(new Go_paytype(null,goodId,1,0,date,date,null,null));//go_paytype表插入   ,销售类型+需积分+促销开始时间+促销结束时间+补差金额
		
		byte[] bb = image2byte();//得到图片byte数组
		go_pictureMapper.insert(new Go_pictureWithBLOBs(null,goodId,bb, bb, bb, bb, bb));//go_picture表插入  ,五种类型图片添加 
		
		
	
	}
		
	
	
	//图片到byte数组
	  public byte[] image2byte(){
		String  path = System.getProperty("user.dir")+"/src/main/webapp/images/qt_images/good.png";
		//String  kk = "e:\\good.png";
	    byte[] data = null;
	    FileImageInputStream input = null;
	    try {
	      input = new FileImageInputStream(new File(path));
	      ByteArrayOutputStream output = new ByteArrayOutputStream();
	      byte[] buf = new byte[1024];
	      int numBytesRead = 0;
	      while ((numBytesRead = input.read(buf)) != -1) {
	      output.write(buf, 0, numBytesRead);
	      }
	      data = output.toByteArray();
	      output.close();
	      input.close();
	    }
	    catch (FileNotFoundException ex1) {
	      ex1.printStackTrace();
	    }
	    catch (IOException ex1) {
	      ex1.printStackTrace();
	    }
	    return data;
	  }

	
	
	/**
	 * 测试DepartmentMapper
	 */
	@Test
	public void testCRUD(){
		//1、创建SpringIoc容器
//		ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
//		//2、从容器中获取mapper
//		DepartmentMapper bean = ioc.getBean(DepartmentMapper.class);
		
		//System.out.println(administratorMapper);
		//administratorMapper.selectByExample(example);
		
		//1、插入部门信息
//		department.insertSelective(new Department(null,"开发部"));
//		department.insertSelective(new Department(null,"测试部"));
		
		//2、插入员工信息
		//employeeMapper.insertSelective(new Employee(null,"dhj","M","2505728250@qq.com",1));
		
		//3、批量插入多个员工，使用可以执行操作的sqlSession
//		for(){
//			employeeMapper.insertSelective(new Employee(null,"dhj","M","2505728250@qq.com",1));
//		}
//		EmployeeMapper mapper =  sqlSession.getMapper(EmployeeMapper.class);
//		for(int i=0;i<1000;i++){
//			String uid = UUID.randomUUID().toString().substring(0, 5)+i;
//			mapper.insertSelective(new Employee(null,uid,"M",uid+"@qq.com",1));
//		}
//		System.out.println("添加1000完成");
		
		
	}
}
