package org.example.issue14;

import java.util.List;

public class interfaceSample {
    record Student(String name, int score){}
    record Teacher(String name, String subject){}

    public static void main(String[] args){
        var people = List.of(new Student("kis",80),new Teacher("hosoya","Math"));
        for(var p : people){
            /**
             * instanceof構文
             * 変数名 instanceof クラス名　ローカル変数
             *　インスタンスの実態が調べたいとき ＝ AがBと同じクラスのオブジェクトのインスタンスであること
             * AがインタフェースBの実装クラスのオブジェクトのインスタンスである場合はtrueを返す
             */
            var n = p instanceof Student s ? s.name() :
                    p instanceof Teacher t ? t.name() :
                                            "---";

            System.out.println("こんにちは%sさん".formatted(n));
        }
    }
}
