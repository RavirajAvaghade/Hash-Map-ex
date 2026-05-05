# 📘 HashMap Examples in Java

This repository contains various examples of **HashMap implementation in Java**. These programs demonstrate how to store, retrieve, update, and delete key-value pairs using the HashMap class.

---

## 🚀 Features

* Create and initialize HashMap
* Insert key-value pairs
* Retrieve values using keys
* Update existing entries
* Remove elements
* Traverse HashMap using different methods
* Check for key/value existence

---

## 🛠️ Technologies Used

* Java
* JDK 8+
* VS Code / Eclipse / IntelliJ IDEA

---

## 📂 Programs Included

* Basic HashMap Example
* Iterating using `for-each` loop
* Using `Iterator`
* Checking `containsKey()` and `containsValue()`
* Removing elements from HashMap
* Updating values

---

## 💡 Sample Code

```java
import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "Ravi");
        map.put(2, "Raj");
        map.put(3, "Elon");

        System.out.println("Value at key 2: " + map.get(2));

        for (Integer key : map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
        }
    }
}
```

---

## 🎯 Learning Outcomes

* Understanding of key-value pair data structure
* Efficient data storage and retrieval
* Practical knowledge of Java Collections Framework

---

## 📌 Conclusion

HashMap is one of the most important data structures in Java. These examples will help beginners understand how to use HashMap effectively in real-world applications.

---

## 👨‍💻 Author

**Raviraj Yuvraj Avaghade**
Full Stack Developer

---

⭐ If you like this repository, don’t forget to star it!
