package com.itheima.bit;

/**
 * @author admin
 * @Classname Dome02
 * @Version 1.0.0
 * @Date 2022/8/28 20:17
 */
public class Dome02 {
    public static void main(String[] args) {
        /*
        需求:
            身高是具有遗传性的，子女的身高和父母的身高有一定的关系。假定，父母和子女的身高遗传关系如下：
            儿子身高（厘米）＝(父亲身高＋母亲身高) ×1.08÷2
            女儿身高（厘米）＝(父亲身高×0.923＋母亲身高) ÷2
            现有父亲身高177CM,母亲身高165CM。求子女身高分别预计为多少？

        实现步骤:
            1.定义两个int变量h1和h2,代表父亲和母亲的身高,并初始化
            2.根据题目需求计算儿子身高,保存int变量h3中
            3.根据题目需求计算女儿身高,保存int变量h4中
            4.打印h3和h4的值
     */
        int h1 = 177;
        int h2 = 165;
        int h3 = (int)((h1+h2)*1.08/2);
        int h4 = (int)((h1*0.923+h2)/2);
        System.out.println("h3 = " + h3);
        System.out.println("h4 = " + h4);
    }
}
