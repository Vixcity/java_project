class VariableTest3 {
    public static void main(String[] args) {
        double d1 = 12.3;
        int i1 = (int)d1; // 截断操作 => 损失精度
        System.out.println(i1);
    }
}