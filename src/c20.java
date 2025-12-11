//
class MyThread extends Thread{
    public void run(){
        System.out.println(Thread.currentThread().getName());
        for(int i=0;i<5;i++){
            System.out.println("downloading file..."+(i*20)+"%");
        }
    }
}
class main{
    public static void main(String[] args){
        MyThread t1=new MyThread();
//        //MyThread t2=new MyThread();
   t1.start();
        for(int i=0;i<5;i++){
            System.out.println("timer..."+i);
        }

//        for(int i=0;i<5;i++){
//            System.out.println(i+"main");
        try{
           // t1.join();
            Thread.sleep(2000);

        }catch (Exception e){

        }
       for (int i=0;i<5;i++){
           System.out.println(i+"main");
       }

    }
}




