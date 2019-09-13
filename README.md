# NumPy for Chez Scheme

![image](https://github.com/guenchi/numpy/blob/gh-pages/img/NumPy.jpeg)

### and it's faster than the Native NumPy of Python


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


### Depencies:

https://github.com/guenchi/Darkart

https://github.com/python/cpython

https://github.com/numpy/numpy

### The Darkart ecosystem:

https://github.com/guenchi/NumPy

https://github.com/guenchi/SciPy

https://github.com/guenchi/SymPy

https://github.com/guenchi/Matplotlib

https://github.com/guenchi/Pandas