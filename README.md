
ssttp-performance-test
======================

Performance tests for the SSTTP stack
    
### Smoke test

It might be useful to try the journey with one user to check that everything works fine before running the full performance test
```
sbt -Dperftest.runSmokeTest=true test
```

### Run the performance test
```
sbt test
```
