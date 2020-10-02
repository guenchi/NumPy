# NumPy for Chez Scheme

![image](https://github.com/guenchi/numpy/blob/gh-pages/img/NumPy.jpeg)

### and it's faster than the Native NumPy of Python-best example


```
(define get-sin
    (lambda (lst)
        (plist->list
            (np-tolist
                (np-sin
                    (py-div
                        (py-mul pi 
                            (np-array 
                                (list->plist lst) 
                                ('dtype (str "float"))))
                        (int 180)))))))

(display (get-sin '(1 2 3 4 5 6 7 8)))

=>

(0.01745240643728351 0.03489949670250097 0.05233595624294383 0.0697564737441253
 0.08715574274765817 0.10452846326765346 0.12186934340514748 0.13917310096006544)
```
#Example 2
# compare NumPy and native arrays
```
import numpy as np
import time

length = 10
native_lst = [i for i in range(length)]

numpy_lst = np.array(native_lst)
```
# find the speed difference
# use theperf_counter_ns() function instead of time() 
#  As I want the highest possible accuracy
```

time1 = time.perf_counter_ns()
time2 = time.perf_counter_ns()
print = time2 - time1
```
### Depencies:

https://guenchi.github.io/Darkart

https://github.com/python/cpython

https://github.com/numpy/numpy

### The Darkart ecosystem:

https://guenchi.github.io/NumPy

https://guenchi.github.io/SciPy

https://guenchi.github.io/SymPy

https://guenchi.github.io/Matplotlib

https://guenchi.github.io/Pandas
