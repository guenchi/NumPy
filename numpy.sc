;  MIT License

;  Copyright guenchi (c) 2018 
         
;  Permission is hereby granted, free of charge, to any person obtaining a copy
;  of this software and associated documentation files (the "Software"), to deal
;  in the Software without restriction, including without limitation the rights
;  to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
;  copies of the Software, and to permit persons to whom the Software is
;  furnished to do so, subject to the following conditions:
         
;  The above copyright notice and this permission notice shall be included in all
;  copies or substantial portions of the Software.
         
;  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
;  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
;  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
;  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
;  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
;  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
;  SOFTWARE.






(library (numpy numpy)
    (export
        numpy
        ndarray
        pi
        np-array
        np-sin
        np-tolist
        )

        (import
            (scheme)
            (enchantment py call))

(define numpy (py-import 'numpy))
(define ndarray (py-get numpy 'ndarray))
(define pi (py-get numpy 'pi))

(define *array (py-get numpy 'array))
(define *sin (py-get numpy 'sin))
(define *tolist (py-get ndarray 'tolist))

(define-syntax np-array
    (syntax-rules ()
        ((_ e)(py-call *array e))
        ((_ e (k v) ...)((py-call* *array e) (list (cons k v) ...)))))

(define np-sin (py-func1 *sin))
(define np-tolist (py-func1 *tolist))



)