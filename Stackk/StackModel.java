package Stackk;
class StackModel {
    Object[] arr=new Object[5];
int top=-1;
void push(data){
    arr[++top] =data;
}
void show(){
    for(Object element:arr){
        System.out.println(element+" ");
    }
}
    
}
class StackImpl{
    public static void main(String[] args) {
        StackModel<Integer> sm = new StackModel<>();
        sm.push(10);sm.push(20);sm.push(30);sm.show();
        StackModel<String> sm1 = new StackModel<>();
        sm1.push("a");sm1.push("b");sm1.push("c");sm1.show();
       
    }
}
