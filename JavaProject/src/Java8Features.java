import java.util.*;
import java.util.concurrent.ConcurrentMap;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;
import java.math.BigDecimal;
class Product1{  
    int deptId;  
    String name;  
    float price;  
    public Product1(int deptId, String name, float price) {  
        this.deptId = deptId;  
        this.name = name;  
        this.price = price;  
    }
	public int getId() {
		return deptId;
	}
	public String getName() {
		return name;
	}
	public float getPrice() {
		return price;
	}
    
}  
public class Java8Features {  
    public static void main(String[] args) {  
        List<Product1> pList = new ArrayList<Product1>();  
        pList.add(new Product1(1,"HP Laptop",28000f));  
        pList.add(new Product1(1,"Dell Laptop",30000f));  
        pList.add(new Product1(1,"Lenevo Laptop",28000f));  
        pList.add(new Product1(4,"Sony Laptop",28000f));  
        pList.add(new Product1(5,"Apple Laptop",90000f));  
        List<String> list = Arrays.asList("HP Laptop","Dell Laptop","Lenevo Laptop","Sony Laptop","Apple Laptop","HP Laptop","HP Laptop","Lenevo Laptop");
        List<Item> items = Arrays.asList(
                new Item("apple", 10, new BigDecimal("9.99")),
                new Item("banana", 20, new BigDecimal("19.99")),
                new Item("orang", 10, new BigDecimal("29.99")),
                new Item("watermelon", 10, new BigDecimal("29.99")),
                new Item("papaya", 20, new BigDecimal("9.99")),
                new Item("apple", 10, new BigDecimal("9.99")),
                new Item("banana", 10, new BigDecimal("19.99")),
                new Item("apple", 20, new BigDecimal("9.99"))
        );
        Optional<String> findFirst = list.stream().findFirst();
        if(findFirst.isPresent()) {
        	System.out.println(findFirst.get());
        	System.out.println(findFirst.orElse(testMathods("Laptop")));
        	System.out.println(findFirst.orElseGet(()->testMathods("c")));//takes supplier
        	findFirst.ifPresent(a->testMathods(a));//takes consumer
        }
        System.out.println(list.stream().allMatch(a->a.contains("testMathods")));//returns boolean
        System.out.println(list.stream().anyMatch(a->a.contains("Sony Laptop")));
        List<String> asList = list.stream().collect(Collectors.toList());
        Map<Integer, List<Product1>> peopleByCity
        = pList.stream().collect(Collectors.groupingBy(Product1::getId));
        Map<Integer, List<String>> peopleByCity1
        = pList.stream().collect(Collectors.groupingBy(Product1::getId,Collectors.mapping(Product1::getName, Collectors.toList())));
        Map<Integer, Map<Float, List<Product1>>> peopleByStateAndCity
        = pList.stream().collect(Collectors.groupingBy(Product1::getId,Collectors.groupingBy(Product1::getPrice)));
        Map<Integer, Optional<Product1>> peopleByStateAndCity2
        = pList.stream().collect(Collectors.groupingBy(Product1::getId,Collectors.reducing(BinaryOperator.maxBy(Comparator.comparing(Product1::getPrice)))));
        

        Map<String, Long> result =list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        

        Map<String, Long> counting = items.stream().collect(
                Collectors.groupingBy(Item::getName, Collectors.counting()));

        System.out.println(counting);

        Map<String, Integer> sum = items.stream().collect(
                Collectors.groupingBy(Item::getName, Collectors.summingInt(Item::getQty)));
        
        Double x = pList.stream().collect(Collectors.averagingDouble(Product1::getPrice));
        Long count = list.stream().collect(Collectors.counting());
        
        Stream<String> s = Stream.of("apple", "banana", "orange");
        Map<Integer, List<String>> map = s.collect(Collectors.groupingByConcurrent(String::length));//{5=[apple], 6=[banana, orange]}
        
        List<String> collect = pList.stream().collect(Collectors.mapping(Product1::getName, Collectors.toList()));
        Optional<Product1> collect2 = pList.stream().collect(Collectors.maxBy(Comparator.comparing(Product1::getPrice)));
        
        List<Integer> intList = Arrays.asList(2, 4, 5, 6, 8);
        Map<Boolean, List<Integer>> isEven = intList.stream().collect(
        Collectors.partitioningBy(i -> i % 2 == 0));
        List<Integer> list2 = isEven.get(true);
        
        Collector<Product1, ?, Optional<Product1>> reducing = Collectors.reducing(BinaryOperator.maxBy(Comparator.comparing(Product1::getPrice)));
//        pList.stream().collect(Collectors.groupingBy(Product1::getPrice,Collectors.reducing(Product1::getName,BinaryOperator.maxBy(Comparator.comparing(String::length)))));
        DoubleSummaryStatistics collect4 = pList.stream().collect(Collectors.summarizingDouble(Product1::getPrice));
        Double collect5 = pList.stream().collect(Collectors.summingDouble(Product1::getPrice));
        Vector<String> empNames = pList.stream().map(Product1::getName).collect(Collectors.toCollection(Vector::new));
        ConcurrentMap<String, Float> collect6 = pList.stream().collect(Collectors.toConcurrentMap(Product1::getName, Product1::getPrice));
        List<String> collect7 = list.stream().collect(Collectors.toList());
        Map<String, Float> collect3 = pList.stream().collect(Collectors.toMap(Product1::getName, Product1::getPrice));
        Set<String> collect8 = list.stream().collect(Collectors.toSet());
        
//        list.stream().collect(supplier, accumulator, combiner);
        System.out.println(list.stream().count());
        list.stream().distinct().forEach(a->System.out.println(a));;
        list.stream().filter(a->a.contains("Laptop"));
        Optional<String> findAny = list.stream().findAny();
        
        List<List<String>> namesNested = Arrays.asList( 
        	      Arrays.asList("Jeff", "Bezos"), 
        	      Arrays.asList("Bill", "Gates"), 
        	      Arrays.asList("Mark", "Zuckerberg"));

        List<String> namesFlatStream = namesNested.stream().flatMap(y->y.stream()).collect(Collectors.toList());
        long[][] data = {{1L,2L},{3L,4L},{5L,6L}};
		LongStream ls1 = Arrays.stream(data).flatMapToLong(row -> Arrays.stream(row));
        
        list.stream().forEach(a->System.out.println(a));
        list.stream().forEachOrdered(a->System.out.println(a));
		Stream.iterate(1,i->i+5).limit(5).forEach(a->System.out.println(a));
        list.stream().map(a->a.toUpperCase()).forEach(a->System.out.println(a));
        DoubleStream mapToDouble = pList.stream().mapToDouble(i->i.getId());
        IntStream mapToInt = pList.stream().mapToInt(Product1::getId);
        Optional<String> max = list.stream().max(Comparator.comparing(String::valueOf).reversed());
        boolean noneMatch = list.stream().noneMatch(i->i.contains("a"));
        list.stream().parallel().forEach(a->System.out.println(a));
        
        list.stream().reduce("a",String::concat);
        Optional<Float> sumSal = pList.stream().map(Product1::getPrice).reduce(Float::sum);
        Optional<Float> reduce = pList.stream().map(Product1::getPrice).reduce((a,b)->a+b);
        int reducedTwoParams =IntStream.range(1, 4).reduce(10, (a, b) -> a + b);
        int reducedParams = Stream.of(1, 2, 3).reduce(10, (a, b) -> a + b, (a, b) -> {
        		     System.out.println("combiner was called");//16 (10 + 1 + 2 + 3)
        		     return a + b;
        		  });
//        The result will be the same as in the previous example (16) and there will be no login which means, that combiner wasn’t called. To make a combiner work, a stream should be parallel:
//         Arrays.asList(1, 2, 3).parallelStream().reduce(identity, accumulator, combiner);
        int reducedParallel = Arrays.asList(1, 2, 3).parallelStream().reduce(10, (a, b) -> a + b, (a, b) -> {
        	 System.out.println("combiner was called");//12 + 13 = 25; 25 + 11 = 36
        	       return a + b;
        	    });
        
        
        list.stream().sequential().forEach(a->System.out.println(a));;
        list.stream().skip(5).forEach(a->System.out.println(a));;
        list.stream().sorted();
        pList.stream().sorted(Comparator.comparing(Product1::getPrice).reversed()).forEach(a->System.out.println(a));
        Integer[] array = list.stream().toArray(Integer[]::new);
        
        list.parallelStream().forEach(a->System.out.println(a));
    }

	private static String testMathods(String string) {
		System.out.println(" called for orElse when no data in the list:"+string);
		return string.toUpperCase();
	}  
	
}  


 class Item {
	 	private String name;
	    private int qty;
	    private BigDecimal price;
    public Item(String string, int i, BigDecimal bigDecimal) {
    	this.name=string;
    	this.qty=i;
    	this.price=bigDecimal;
	}
    public String getName() {
    	return name;
    }
	public int getQty() {
		return qty;
	}
	public BigDecimal getPrice() {
		return price;
	}

    //constructors, getter/setters 
}