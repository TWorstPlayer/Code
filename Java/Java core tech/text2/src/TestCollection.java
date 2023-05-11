import java.util.ArrayList;

public class TestCollection {
    public static void main(String[] args) {
        // 初始化ArrayList集合
        ArrayList<Hero> heros = new ArrayList<>();
        // 添加100个对象
        for (int i = 0; i < 100; i++) {
            Hero hero1 =new Hero("hero "+i);
            heros.add(hero1);
        }
        // 删除对象

        for(int i=0,a=0; i <heros.size();i++) {
            Hero hero1 =heros.get(i);
            if(i%7==0){
                heros.remove(hero1);
            }
        }

        // 打印信息
        for(Hero a:heros){
            System.out.println(heros.get(heros.indexOf(a)));
        }

    }
}

