# Java 技術メモ

## クラスのメンバーには４つの要素がある

- コンストラクタ

  クラス名と同じ名前のメソッドであること。

  必ずそのクラスのオブジェクトを返すため、戻り値は指定しないこと。

  引数なしのコンストラクタは、デフォルトコンストラクタである。

    ```java
    
    public class Student{
    	Student(String name, int point){
    			this.name = name;
    			this.point = point;
    	}
    }
    ```

- フィールド

  オブジェクトに関する情報を保持するのがフィールドであること

  基本的に、finalフィールドを推奨。

  getter,setterがあり、まとめてアクセッサと呼ぶ。

- メソッド
- ネステッドクラス