import com.vge.domain.Student;
import com.vge.service.StudentService;
import com.vge.service.impl.StudentServiceImpl;
import com.vge.util.ServiceFactory;

import java.util.List;

/**
 * Created by vge on 2020/9/10
 */
public class Test01 {
    public static void main(String[] args) {

        // 张三形态，不走事务
        //StudentService ss = new StudentServiceImpl();
        // 李四形态
        StudentService ss = (StudentService) ServiceFactory.getService(new StudentServiceImpl());
        ;

        /*

            1、需求：根据id查单条

            如果取得的是单条记录，我们调用selectOne方法
            参数1：根据命名空间.sqlId的形式找到我们需要使用的sql语句
            参数2：我们要为sql语句中传递的参数

        */

        // 虽然查询的时候，不需要提交事务，可以不用李四，用张三就行了。但是这里我们统一用李四就行了！
        /*
        Student s = ss.getById("003");
        System.out.println(s);
        */
        // 2、需求：查询学生信息表中所有的记录


        List<Student> sList = ss.getAll();
        for (Student s : sList) {
            System.out.println(s);
        }

        // 3、需求：添加一个学生

        /*

        Student s = new Student("010","xiaosb",17);
        // 注意这里的ss是李四，明明李四走的是save方法，为什么会走到TransactionInvocationHandler中的invoke方法
        // 而invoke中才有张三的处理具体业务的方法，最后提交事务
        // 以上不需要明白，invoke是虚拟机生成的。这就是动态代理，而动态代理中有具体的提交事务
        ss.save(s);
        */

        // 4、需求：修改一个学生

        /*
        Student s = new Student("007","xiaomei",18);
        ss.update(s);
        */

        //5、需求：删除一个学生

        /*
        ss.delete("010");
        */
    }
}
