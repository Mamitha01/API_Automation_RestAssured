package org.example.bp;

public class BuilderpatternDesignpatternJava {

    public BuilderpatternDesignpatternJava stag1(){
        System.out.println("Stage1");
        return this;
    }

    public BuilderpatternDesignpatternJava stag2(String str){
        System.out.println("Stage2");
        return this;
    }

    public BuilderpatternDesignpatternJava stag3(){
        System.out.println("Stage3");
        return this;
    }

    public static void main(String[] args) {
        BuilderpatternDesignpatternJava bp = new BuilderpatternDesignpatternJava();
        bp.stag1().stag2("test").stag3();
    }
}
