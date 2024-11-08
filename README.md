# Rekursion, minne och abstrakta datatyper
![Mandelbrotfraktalen](assets/top-image.jpg)

## Innehåll
- [Kodexempel](#kodexempel)
- [Föreläsningsslides](#presentationer)
- [Andra filer](#andra-filer)
- [Resurser](#resurser)

# <a id="kodexempel"></a>Kodexempel

Sourcemappen innehåller:

| Filnamn                         | Beskrivning                                                                                                                                     |
|----------------------------------|-------------------------------------------------------------------------------------------------------------------------------------------------|
| **Ackermann.java**               | Exempel på Ackermannfunktionen, den första ickeprimitiva rekursiva funktionen som upptäcktes (löjligt beräkningstung!)                          |
| **BinarySearch.java**            | Exempel på hur en binär sökning fungerar i Java.                                                                                                |
| **FibonacciIterative.java**      | Ett exempel på hur iteration kan användas för att få bort den exponentiella tidskomplexiteten som en rekursiv fibonacci innebär.              |
| **FibonacciRecursive.java**      | En rekursiv fibonaccialgoritm som anropar sig själv två gånger varje gång den körs.                                                              |
| **FibonacciRecursiveDynamic.java**| Ett rekursivt fibonaccialternativ som använder en dynamisk programmeringsteknik för att effektivisera algoritmen.                                 |
| **FibonacciStackCounter.java** | Ett program som genererar en webbsida som visar vad som pushas på och poppas från callstacken när en rekursiv fibonaccialgoritm anropas. |
| **Node.java** | En klass som kan användas för att bygga en Länkad Lista. En Node innehåller en instans av sig själv och kan därför sägas vara en rekursiv datastruktur. |
| **SierpinskiTriangle.java** | Ett program som ritar upp en liksidig triangel och för varje rekursivt anrop sedan delar in den i tre mindre trianglar. Använd +/- för att zooma och c för att slå på/av färg. |
| **Stack.java**                   | En implementation av en stack som använder Generics för att man ska kunna lagra olika typer av data i den. |
| **TreeNode.java** | En TreeNode är ungefär samma sak som en Node, men den innehåller **två** instanser av sig själv. Vi kan använda en trädnod för att bygga ett binärt sökträd.|
| **ValueVsReference.java**       | Ett kort exempel som illustrerar skillnaden mellan att skicka variabler som värde och att skicka dem som referenser (detta sköts automatiskt i Java men man behöver förstå vad som händer). |

# <a id="presentationer"></a>Föreläsningsslides
| Filnamn                         | Beskrivning                                                                                                                                     |
|----------------------------------|-------------------------------------------------------------------------------------------------------------------------------------------------|
|[**Föreläsning_1_Algo.pdf**](Föreläsning_1_Algo.pdf)| Presentationen från föreläsningstillfälle 1 och 2 (29/1) där vi behandlade rekursiva algoritmer, callstacken, minne, referenser och dynamisk programmering. |
|[**Föreläsning_2_Algo.pdf**](Föreläsning_2_Algo.pdf)| Presentationen från föreläsningstillfälle 3 och 4 (30/1) där vi pratade om träd, grafer, abstrakta datatyper, Generics och garbage collection. |

# <a id="andra-filer"></a>Andra filer
| Filnamn                         | Beskrivning                                                                                                                                     |
|----------------------------------|-------------------------------------------------------------------------------------------------------------------------------------------------|
|[**Rekursivt_fibonacciträd.pdf**](Rekursivt_fibonacciträd.pdf) | En bättre översikt av anropsträdet som skapas när vi anropar en rekursiv fibonaccialgoritm. Visar även hur anropen returnerar värden.            |
|[**Uppgifter.pdf**](Uppgifter.pdf) | Uppgifter att arbeta med som handlar om det vi gått genom under föreläsningarna. |
|[**Uppgifter_lösningsförslag.pdf**](Uppgifter_lösningsförslag)| Lösningsförslag till uppgifterna ovan. (Försök att lösa dem själva innan ni kikar på lösningarna!) |

# <a id="resurser"></a>Resurser
- **Bra sammanfattning av Generics i Oracles Javadokumentation**: https://docs.oracle.com/javase/tutorial/java/generics/index.html
- **Fördjupning: Replication is recursion**: Publicering om hur rekursion i datorvetenskap, matematik och biologi hänger samman: https://www.researchgate.net/publication/275658586_Replication_is_Recursion_or_Lambda_the_Biological_Imperative <br>
- **Kort film om MC Escher** (4 min)<br>
[<img src="https://img.youtube.com/vi/Kcc56fRtrKU/hqdefault.jpg" alt="MC Escher" width="500"/>](https://www.youtube.com/watch?v=Kcc56fRtrKU)
- **Fördjupning: Ackermannfunktionen** (14 min)<br>
[<img src="https://img.youtube.com/vi/i7sm9dzFtEI/maxresdefault.jpg" alt="Fördjupning: Ackermannfunktionen" width="500"/>](https://www.youtube.com/watch?v=i7sm9dzFtEI)
-

