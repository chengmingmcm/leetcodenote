import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;




public class Test3 {
    public static void main(String[] args) {
        String[] strs = new String[100];
        for (int i = 0; i <100; i++) {
            strs[i] = getRandomStr(2);
        }
        System.out.println(Arrays.toString(strs));
        int a = 0;
        for (String s:strs) {
            System.out.print(s+" ");
            a++;
            if(a==20){
                a=0;
                System.out.println();
            }
        }
        chechRepeat(strs);

    }

    private static void chechRepeat(String[] strs){
        Map<String, Integer> hm = new HashMap<String, Integer>();
        //检查有没有相同的，存入hm
        for(String s:strs){
            if(!hm.containsKey(s)){
                hm.put(s, 1);
            }else{
                int value =  hm.get(s);
                hm.replace(s,value++);
            }
        }

        for (String key : hm.keySet()) {
            if(hm.get(key)>1){
                System.out.println(key+"发生了重复，重复了"+hm.get(key)+"次");
            }
        }
    }



    private static String getRandomStr(int length) {
        String strPool="";
        for (int i = '0'; i <= '9'; i++) {
            strPool += ((char) i);
        }
        for (int i = 'a'; i <= 'z'; i++) {
            strPool += ((char) i);
        }
        for (int i = 'A'; i <= 'Z'; i++) {
            strPool += ((char) i);
        }
        //System.out.println(strPool);
        // 创建长度为length  5 的字符数组
        char[] chars = new char[length];
        Random random = new Random();
        for (int i = 0; i < chars.length; i++) {
            // random中 nextInt(int bound)方法 随机数范围为[0,bound)
            int index = random.nextInt(strPool.length());
            // 从字符串中获取1个随机的字符 并填充到字符数组中
            chars[i] = strPool.charAt(index);
        }

        //System.out.println(Arrays.toString(chars));

        // 将填充过数据的字符数组转化为字符串
        String randomStr = new String(chars);

        // 返回生成的随机字符串
        //System.out.println(randomStr);
        return randomStr;
    }
}