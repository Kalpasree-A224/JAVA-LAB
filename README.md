# Java Programming Laboratory

This repository contains runnable examples and short theory notes for ten Java laboratory experiments. Each experiment has its own folder (`EXP-1` through `EXP-10`); the subfolders contain the individual parts of experiments with multiple exercises.

## Experiments

1. **Arrays and searching** — sorting, binary search, min/max, and filtering marks
2. **Arithmetic and decisions** — operators, even/odd, largest value, and leap years
3. **Number programs** — Armstrong, Fibonacci, multiplication table, perfect number, and reversal
4. **String operations** — character and substring replacement and substring extraction
5. **Packages and shapes** — arithmetic packages, area, and perimeter
6. **Interfaces** — student results, cylinder, and sphere
7. **Inheritance** — savings accounts and college departments
8. **Threads** — thread creation, joining, and priorities
9. **File handling** — reading and writing text files
10. **AWT applets** — drawing and AWT layout/event examples

The Java examples use small, editable sample values in `main` or `init`. Each experiment's `theory.md` explains its concepts and files.

## Compile and run

Use a JDK and run commands from the repository root. For example:

```bash
mkdir -p build
javac -d build EXP-1/*.java
java -cp build AscendingOrder
```

For the package-based arithmetic and shape examples:

```bash
javac -d build EXP-5/5.a/add/*.java EXP-5/5.a/sub/*.java \
  EXP-5/5.a/mul/*.java EXP-5/5.a/div/*.java EXP-5/5.a/ArithDemo.java
java -cp build ArithDemo

javac -d build EXP-5/5.b/Shape/*.java EXP-5/5.b/Calculate.java
java -cp build Calculate
```

To compile the multi-file console exercises for Experiments 1–4 and parts 5.a–9.b together:

```bash
javac -d build EXP-1/*.java EXP-2/*.java EXP-3/*.java EXP-4/*.java \
  EXP-5/5.a/add/*.java EXP-5/5.a/sub/*.java EXP-5/5.a/mul/*.java \
  EXP-5/5.a/div/*.java EXP-5/5.a/ArithDemo.java \
  EXP-5/5.b/Shape/*.java EXP-5/5.b/Calculate.java \
  EXP-6/6.a/*.java EXP-6/6.b/*.java EXP-7/7.a/*.java EXP-7/7.b/*.java \
  EXP-8/8.a/*.java EXP-8/8.b/*.java EXP-9/9.a/*.java EXP-9/9.b/*.java
java -cp build Result
```

Other top-level example files can be compiled as a group for their experiment, for example `javac -d build EXP-6/*.java`; run the class containing `main` with `java -cp build ClassName`. Keep experiment parts in separate output directories if they define classes with the same name. The file-reading examples use their included `sample2.txt` when run from their own folder; an optional first argument selects a different path. The file-writing examples default to `output.txt` and accept an optional output path.

## Legacy applets

Experiment 10 intentionally uses the legacy `java.applet.Applet` API. Applets are obsolete, and modern JDKs (including JDK 25) no longer provide a browser applet runtime or `appletviewer`. These sources are retained for the lab exercise; use a compatible legacy JDK and applet viewer to run them.