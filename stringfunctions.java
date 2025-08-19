public static void main(String[] args) { 
String a = "cse class";
String b = "Cse class"; 
System.out.println("a : "+a); 
System.out.println("b : "+b);
System.out.println("a HashCode "+a.hashCode()); 
System.out.println("b HashCode "+b.hashCode()); 
System.out.println("Equal : "+a.equals(b)); 
System.out.println("Equal Ignore case : "+a.equalsIgnoreCase(b)); 
System.out.println("Length : "+a.length()); 
System.out.println("CharAt : "+a.charAt(0)); 
System.out.println("Uppercase : "+a.toUpperCase()); 
System.out.println("Lowercase : "+a.toLowerCase()); 
System.out.println("Replace : "+a.replace("Cse","Ece")); 
System.out.println("Contains : "+a.contains("Cse")); 
System.out.println("Empty : "+a.isEmpty()); 
System.out.println("startsWith : "+a.startsWith("Cs")); 
System.out.println("Substring : "+a.substring(4)); 
System.out.println("Substring : "+a.substring(0,5));
}
}
