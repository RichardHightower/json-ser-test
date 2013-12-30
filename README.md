JSON serialization test
===

Participants:
* [Groovy](http://groovy.codehaus.org/) ([JsonOutput](http://groovy.codehaus.org/gapi/groovy/json/JsonOutput.html))
* [Jackson](http://wiki.fasterxml.com/JacksonRelease20)
* [Gson](https://code.google.com/p/google-gson/)
* GroovyJava (JsonOutput rewritten to Java)
* GroovyJavaWithoutRecursion (JsonOutput rewritten to Java without recursion)
* Boon


After optimizing:

```
Benchmark                                            Mode Thr     Count  Sec         Mean   Mean error    Units
o.b.j.Test.complextTestBoon                         thrpt   1         3    1    12850.483     1345.387    ops/s
o.b.j.Test.complexTestJackson                       thrpt   1         3    1    13781.272     7161.822    ops/s
o.b.j.Test.complexTestGson                          thrpt   1         3    1     4886.206     3595.026    ops/s
o.b.j.Test.complexTestGroovyJava                    thrpt   1         3    1     1781.678     2976.582    ops/s
o.b.j.Test.complexTestGroovyJavaWithoutRecursion    thrpt   1         3    1     1617.833     3463.947    ops/s
o.b.j.Test.complexTestGroovy                        thrpt   1         3    1      767.856     1757.046    ops/s

o.b.j.Test.mediumTestBoon                           thrpt   1         3    1   356354.356    92409.796    ops/s
o.b.j.Test.mediumTestJackson                        thrpt   1         3    1   134202.128   163113.418    ops/s
o.b.j.Test.mediumTestGson                           thrpt   1         3    1    75637.267   106000.320    ops/s
o.b.j.Test.mediumTestGroovyJava                     thrpt   1         3    1    51183.611    76084.378    ops/s
o.b.j.Test.mediumTestGroovyJavaWithoutRecursion     thrpt   1         3    1    37264.683    52765.834    ops/s
o.b.j.Test.mediumTestGroovy                         thrpt   1         3    1     9596.406    32524.504    ops/s

o.b.j.Test.simpleTestBoon                           thrpt   1         3    1  1592641.094   260806.215    ops/s
o.b.j.Test.simpleTestJackson                        thrpt   1         3    1   407893.461   651678.343    ops/s
o.b.j.Test.simpleTestGson                           thrpt   1         3    1   309175.322   422653.544    ops/s
o.b.j.Test.simpleTestGroovy                         thrpt   1         3    1    53658.911    70480.130    ops/s
o.b.j.Test.simpleTestGroovyJava                     thrpt   1         3    1    50355.022    91832.904    ops/s
o.b.j.Test.simpleTestGroovyJavaWithoutRecursion     thrpt   1         3    1    37634.989    65995.555    ops/s

```


Return a String not a CharSequence
```

Benchmark                                      Mode Thr     Count  Sec         Mean   Mean error    Units


Test.mediumTestBoon                           thrpt   1         5    1   268972.367    19893.298    ops/s
Test.mediumTestJackson                        thrpt   1         5    1   172173.310    79104.897    ops/s
Test.mediumTestGson                           thrpt   1         5    1    96153.873    48267.235    ops/s
Test.mediumTestGroovyJava                     thrpt   1         5    1    67499.537    46362.218    ops/s
Test.mediumTestGroovyJavaWithoutRecursion     thrpt   1         5    1    47740.303    29863.004    ops/s
Test.mediumTestGroovy                         thrpt   1         5    1    11157.990     3892.818    ops/s

Test.simpleTestBoon                           thrpt   1         5    1  1195900.870    28042.073    ops/s
Test.simpleTestJackson                        thrpt   1         5    1   557650.770   250583.057    ops/s
Test.simpleTestGson                           thrpt   1         5    1   387067.607   216498.842    ops/s
Test.simpleTestGroovyJava                     thrpt   1         5    1    68075.113    44150.799    ops/s
Test.simpleTestGroovy                         thrpt   1         5    1    60132.500    21514.814    ops/s
Test.simpleTestGroovyJavaWithoutRecursion     thrpt   1         5    1    48145.780    29871.625    ops/s

Test.complexTestJackson                       thrpt   1         5    1    13129.467     2260.256    ops/s
Test.complextTestBoon                         thrpt   1         5    1     7309.860      250.486    ops/s
Test.complexTestGson                          thrpt   1         5    1     5514.013     1778.128    ops/s
Test.complexTestGroovyJava                    thrpt   1         5    1     2408.420     1713.882    ops/s
Test.complexTestGroovyJavaWithoutRecursion    thrpt   1         5    1     2207.643     1521.711    ops/s
Test.complexTestGroovy                        thrpt   1         5    1      949.057      468.135    ops/s

```

Results
---

	Benchmark                                            Mode Thr     Count  Sec         Mean   Mean error    Units
	o.b.j.Test.complexTestGroovy                        thrpt   1        20    1      991.981       12.725    ops/s
	o.b.j.Test.complexTestGroovyJava                    thrpt   1        20    1     2549.993       28.527    ops/s
	o.b.j.Test.complexTestGroovyJavaWithoutRecursion    thrpt   1        20    1     2233.074       78.201    ops/s
	o.b.j.Test.complexTestGson                          thrpt   1        20    1     5099.543      104.108    ops/s
	o.b.j.Test.complexTestJackson                       thrpt   1        20    1    12168.617      298.710    ops/s
	o.b.j.Test.mediumTestGroovy                         thrpt   1        20    1    10786.671      256.090    ops/s
	o.b.j.Test.mediumTestGroovyJava                     thrpt   1        20    1    69296.676     1704.828    ops/s
	o.b.j.Test.mediumTestGroovyJavaWithoutRecursion     thrpt   1        20    1    50972.672      699.862    ops/s
	o.b.j.Test.mediumTestGson                           thrpt   1        20    1    95269.984     1426.431    ops/s
	o.b.j.Test.mediumTestJackson                        thrpt   1        20    1   165929.238     2106.969    ops/s
	o.b.j.Test.simpleTestGroovy                         thrpt   1        20    1    60917.283      728.287    ops/s
	o.b.j.Test.simpleTestGroovyJava                     thrpt   1        20    1    70273.187     1513.372    ops/s
	o.b.j.Test.simpleTestGroovyJavaWithoutRecursion     thrpt   1        20    1    51727.987     1066.752    ops/s
	o.b.j.Test.simpleTestGson                           thrpt   1        20    1   393817.200     4769.662    ops/s
	o.b.j.Test.simpleTestJackson                        thrpt   1        20    1   521774.452    16102.207    ops/s

Testing environment: Ubuntu 13.10 (64-Bit), Oracle Java HotSpot 64-bit 1.7.0_45

Build and Run
---

	gradle clean; gradle shadow; java -Xmx1024m -jar target/libs/microbenchmarks.jar ".*Test.*" -f 1
