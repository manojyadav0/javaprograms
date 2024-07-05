package Heap;
public class Heapmin {
    public static void main(String[] args) {
        int[] arr;
        int size;
        Heapmin(){
            this.size=0;
            arr=new int[20];
        }
        int parentpos(int pos){
            return (pos-1)/2;
        }
        int getLeftpos(int pos){
            return (pos*1)+1;

        }
        int getrightchildpos(int pos){
            return (pos*2)+2;
        }
        void print(){
            for(int i=0;i<size/2;i++){
                System.out.println("parent:"+arr[i]);
                if(getleftpos(i)<size){
                    System.out.println("Left child:"+arr[i]);
                }
                if(getrightchildpos(i)<size){
                    System.out.println("Right child:"+arr[i]);
                }
                System.out.println();
            }
        }
        void swap(int curpos,int parpos){
            int t;
            t=arr[curpos];
            arr[curpos]=arr[parpos];
            arr[parpos]=t;
        }
        void insert(int ele){
            arr[size]=ele;
            int current=size;
            while(arr[current]<arr[parentpos(current)]){
                swap(current,parentpos(current));
                current=parentpos(current);

            }
            size++
        }
        boolean isLeaf(int pos){
            if(pos>(size/2) && pos<=size){
                return true;
            }
            return false;
        }
        int poll(){
            int popped=arr[0];
            arr[0]=arr[--size];
            return popped;

        }
        void heapify(int pop){
            if(isLeaf(pos)){
                return;
            }
            if(arr[pos]<arr[getLeftpos(pos)] || arr[pos]<arr[getRightchildPos(pos)]){
                if(arr[getLeftpos(pos)]>arr[getRightchildPos(pos)]){
                    swap(pos,getLeftpos(pos));
                    heapify(getLeftpos(pos));
                }
                else{
                    swap(pos,getRight)
                }

            }
        }
        
       
        public static void main(String[] args){
            Heapmin mp=ne Heapmin();
            mp.insert(10);
            mp.insert(5);
            mp.insert(20);
            mp.insert(2);
            mp.insert(30);
            mp.insert(6);

        }

    }
    
}
