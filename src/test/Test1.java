import com.baidu.arrayList.ExaArrayList;

import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args){
        //    ExaArrayList list = new ExaArrayList();
//        list.add("张三");
//        list.add("李四");
//        list.add("王五");
//        list.add("赵六");
//        list.add("钱七");
//        list.remove(2);
//        System.out.println(list.get(2));

        ArrayList<String> list = new ArrayList<>();
            list.add("张三");
            list.add("李四");
            list.add("王五");
            list.add("赵六");
            list.add(3,"王八");
            list.remove(2);



    }

}
