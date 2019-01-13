;  MIT License

;  Copyright guenchi (c) 2018 - 2019 
         
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
        np-asarray
        np-empty
        np-ones
        np-zeros
        np-from-buffer
        np-from-iter
        np-linspace
        np-logspace
        np-sin
        np-tolist
        np-shape
        np-size
        )

        (import
            (chezscheme)
            (darkart py call))

(define numpy (py-import 'numpy))
(define ndarray (py-get numpy 'ndarray))
(define pi (py-get numpy 'pi))

(define *array (py-get numpy 'array))
(define *asarray (py-get numpy 'asarray))
(define *empty (py-get numpy 'empty))
(define *ones (py-get numpy 'ones))
(define *zeros (py-get numpy 'zeros))
(define *from-buffer (py-get numpy 'frombuffer))
(define *from-iter (py-get numpy 'fromiter))
(define *arange (py-get numpy 'arange))
(define *linspace (py-get numpy 'linspace))
(define *logspace (py-get numpy 'logspace))
(define *sin (py-get numpy 'sin))
(define *tolist (py-get ndarray 'tolist))
(define *shape (py-get numpy 'shape))
(define *size (py-get numpy 'size))



(define-syntax np-array
    (syntax-rules ()
        ((_ e)(py-call *array e))
        ((_ e (k v) ...)
            ((py-call* *array e) 
                (list (cons k v) ...)))))

(define-syntax np-asarray
    (syntax-rules ()
        ((_ e)(py-call *asarray e))
        ((_ e (k v) ...)
            ((py-call* *asarray e) 
                (list (cons k v) ...)))))

(define-syntax np-empty
    (syntax-rules ()
        ((_ e)(py-call *empty e))
        ((_ e (k v) ...)
            ((py-call* *empty e) 
                (list (cons k v) ...)))))

(define-syntax np-ones
    (syntax-rules ()
        ((_ e)(py-call *ones e))
        ((_ e (k v) ...)
            ((py-call* *ones e) 
                (list (cons k v) ...)))))

(define-syntax np-zeros
    (syntax-rules ()
        ((_ e)(py-call *zeros e))
        ((_ e (k v) ...)
            ((py-call* *zeros e) 
                (list (cons k v) ...)))))

(define-syntax np-from-buffer
    (syntax-rules ()
        ((_ e)(py-call *from-buffer e))
        ((_ e (k v) ...)
            ((py-call* *from-buffer e) 
                (list (cons k v) ...)))))

(define-syntax np-from-iter
    (syntax-rules ()
        ((_ e)(py-call *from-iter e))
        ((_ e (k v) ...)
            ((py-call* *from-iter e) 
                (list (cons k v) ...)))))

(define-syntax np-linspace
    (syntax-rules ()
        ((_ e)(py-call *linspace e))
        ((_ e (k v) ...)
            ((py-call* *linspace e) 
                (list (cons k v) ...)))))

(define-syntax np-logspace
    (syntax-rules ()
        ((_ e)(py-call *logspace e))
        ((_ e (k v) ...)
            ((py-call* *logspace e) 
                (list (cons k v) ...)))))




(define np-sin (py-func *sin))
(define np-tolist (py-func *tolist))
(define np-shape (py-func *shape))
(define np-size (py-func *size))



)