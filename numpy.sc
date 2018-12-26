(library (numpy numpy)
    (export
        numpy
        ndarray
        pi
        np-array
        np-sin
        np-tolist)

        (import
            (scheme)
            (enchantment py call))

(define numpy (py-import 'numpy))
(define ndarray (py-get numpy 'ndarray))
(define pi (py-get numpy 'pi))

(define *array (py-get numpy 'array))
(define *sin (py-get numpy 'sin))
(define *tolist (py-get ndarray 'tolist))

(define np-array (py-func1 *array))
(define np-sin (py-func1 *sin))
(define np-tolist (py-func1 *tolist))

)