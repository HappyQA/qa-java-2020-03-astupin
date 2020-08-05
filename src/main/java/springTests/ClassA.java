//package springTests;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.stereotype.Component;
//
//@Component
//public class ClassA {
////    private final MyInterface myInterface;
////    private final MyInterface myImpl;
//    @Autowired
//    private MyInterface myInterface;
//
//    @Autowired
//    @Qualifier("test")
//    private MyInterface myImpl;
//
////    public ClassA(@Autowired @Qualifier("test") MyInterface myInterface, MyInterface myImpl) {
////        this.myInterface = myInterface;
////        this.myImpl = myImpl;
////    }
//    public void somePrint () {
//        System.out.println("get name from ClassA");
//        System.out.println(myInterface.getNameOfClass());
//        System.out.println(myImpl.getNameOfClass());
//    }
//}