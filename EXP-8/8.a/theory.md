# Experiment 8.a: Creating Threads

This example creates two worker threads by extending `Thread`. Starting both workers lets the runtime schedule their work concurrently; `join` keeps the main thread alive until both have completed.
