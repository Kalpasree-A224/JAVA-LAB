# Experiment 5.a: Arithmetic Packages

Each package exposes one operation through a small public class. `ArithDemo` imports and uses those classes. For example:

```bash
javac -d build add/*.java sub/*.java mul/*.java div/*.java ArithDemo.java
java -cp build ArithDemo
```
