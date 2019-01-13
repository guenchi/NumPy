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
    (define matlib (py-import 'numpy.matlib))
    (define ndarray (py-get numpy 'ndarray))
    (define char (py-get numpy 'char))
    (define fft (py-get numpy 'fft))
    (define linalg (py-get numpy 'linalg))
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



    (define *reshape (py-get numpy 'reshape))
    (define *flatten (py-get ndarray 'flatten))
    (define *ravel (py-get numpy 'ravel))
    (define *transpose (py-get numpy 'transpose))
    (define *rollaxis (py-get numpy 'rollaxis))
    (define *swapaxes (py-get numpy 'swapaxes))
    (define *broadcast (py-get numpy 'broadcast))
    (define *expand-dims (py-get numpy 'expand_dims))
    (define *squeeze (py-get numpy 'squeeze))
    (define *concatenate (py-get numpy 'concatenate))

    (define *hstack (py-get numpy 'hstack))
    (define *vstack (py-get numpy 'vstack))
    (define *hsplit (py-get numpy 'hsplit))
    (define *vsplit (py-get numpy 'vsplit))
    (define *resize (py-get numpy 'resize))
    (define *append (py-get numpy 'append))
    (define *insert (py-get numpy 'insert))
    (define *delete (py-get numpy 'delete))
    (define *unique (py-get numpy 'unique))

    (define *bitwise-and (py-get numpy 'bitwise_and))
    (define *bitwise-or (py-get numpy 'bitwise_or))
    (define *invert (py-get numpy 'invert))
    (define *left-shift (py-get numpy 'left_shift))
    (define *right-shift (py-get numpy 'right_shift))

    (define *char-add (py-get char 'add))
    (define *char-multiply (py-get char 'multiply))
    (define *char-center (py-get char 'center))
    (define *char-capitalize (py-get char 'capitalize))
    (define *char-title (py-get char 'title))
    (define *char-lower (py-get char 'lower))
    (define *char-upper (py-get char 'upper))
    (define *char-split (py-get char 'split))
    (define *char-splitlines (py-get char 'splitlines))
    (define *char-strip (py-get char 'strip))
    (define *char-join (py-get char 'join))
    (define *char-replace (py-get char 'replace))
    (define *char-encode (py-get char 'encode))
    (define *char-decode (py-get char 'decode))

    (define *sin (py-get numpy 'sin))
    (define *cos (py-get numpy 'cos))
    (define *tan (py-get numpy 'tan))
    (define *arcsin (py-get numpy 'arcsin))
    (define *arccos (py-get numpy 'arccos))
    (define *arctan (py-get numpy 'arctan))

    (define *hypot (py-get numpy 'hypot))
    (define *arctan2 (py-get numpy 'arctan2))
    (define *degrees (py-get numpy 'degrees))
    (define *radians (py-get numpy 'radians))
    (define *unwrap (py-get numpy 'unwrap))
    (define *deg2rad (py-get numpy 'deg2rad))
    (define *rad2deg (py-get numpy 'rad2deg))

    (define *sinh (py-get numpy 'sinh))

    (define *cosh (py-get numpy 'cosh))

    (define *tanh (py-get numpy 'tanh))

    (define *arcsinh (py-get numpy 'arcsinh))

    (define *arccosh (py-get numpy 'arccosh))

    (define *arctanh (py-get numpy 'arctanh))

    (define *around (py-get numpy 'around))

    (define *round (py-get numpy 'round_))

    (define *rint (py-get numpy 'rint))

    (define *fix (py-get numpy 'fix))

    (define *floor (py-get numpy 'floor))

    (define *ceil (py-get numpy 'ceil))

    (define *trunc (py-get numpy 'trunc))



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