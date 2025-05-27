# Conditionals

### https://www.youtube.com/watch?v=lEj9QtrreZo&list=PL-Jc9J83PIiFj7YSPl2ulcpwy-mwj1SSk&index=6

- Even or Odd
    
    ```java
    		int num = 10;
    		if(num%2 == 0 ) {
    			System.out.println(num +" is even");
    		}else {
    			System.out.println(num +" is odd");
    		}
    ```
    
- Number comaprison
    
    ```java
    		int n1 = 10;
    		int n2 = 60;
    		
    		if(n1 == n2) {
    			System.out.println(n1 +" is equal than "+n2);
    		}else {
    			if(n1>n2) {
    				System.out.println(n1 +" is greater than "+n2);
    			}else {
    				System.out.println(n1 +" is less than "+n2);
    			}
    		}
    ```
    
    ```java
    		int n1 = 10;
    		int n2 = 60;
    		
    		if(n1 == n2) {
    			System.out.println(n1 +" is equal than "+n2);
    		}else if(n1>n2) {
    			System.out.println(n1 +" is greater than "+n2);
    		}else {
    			System.out.println(n1 +" is less than "+n2);
    		}
    ```
    
- Grading system (with input)
    
    ```java
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter marks : ");
    	int marks = sc.nextInt();
    
    	if(marks>90) {
    		System.out.println("excellent");
    	}else if (marks>80){
    		System.out.println("Good");
    	}else if(marks >70) {
    		System.out.println("Fair");
    	}else if(marks>60) {
    		System.out.println("Meets expectations");
    	}else {
    		System.out.println("Below par");
    	}
    ```