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
        char
        fft
        linalg
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
        np-arange
        np-exp
        np-negative
        )

    (import
        (chezscheme)
        (darkart py call))

    (define numpy (py-import 'numpy))
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
    (define *linspace (py-get numpy 'linspace))
    (define *logspace (py-get numpy 'logspace))

    (define *reshape (py-get numpy 'reshape))
    (define *flatten (py-get ndarray 'flatten))
    (define *ravel (py-get numpy 'ravel))

    (define *rollaxis (py-get numpy 'rollaxis))
    (define *swapaxes (py-get numpy 'swapaxes))
    (define *transpose (py-get numpy 'transpose))

    (define *broadcast (py-get numpy 'broadcast))
    (define *broadcast-to (py-get numpy 'broadcast_to))
    (define *expand-dims (py-get numpy 'expand_dims))
    (define *squeeze (py-get numpy 'squeeze))

    (define *concatenate (py-get numpy 'concatenate))
    (define *stack (py-get numpy 'stack))  
    (define *hstack (py-get numpy 'hstack))
    (define *vstack (py-get numpy 'vstack))

    (define *split (py-get numpy 'split))
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

    (define *prod (py-get numpy 'prod))
    (define *sum (py-get numpy 'sum))
    (define *nanprod (py-get numpy 'nanprod)) 
    (define *nansum (py-get numpy 'nansum))
    (define *cumprod (py-get numpy 'cumprod))
    (define *cumsum (py-get numpy 'cumsum))
    (define *nancumprod (py-get numpy 'nancumprod))
    (define *nancumsum (py-get numpy 'nancumsum))
    (define *diff (py-get numpy 'diff))
    (define *ediff1d (py-get numpy 'ediff1d))
    (define *gradient (py-get numpy 'gradient))
    (define *cross (py-get numpy 'cross))
    (define *trapz (py-get numpy 'trapz))

    (define *expm1 (py-get numpy 'expm1))
    (define *exp2 (py-get numpy 'exp2))
    (define *log (py-get numpy 'log))
    (define *log10 (py-get numpy 'log10))
    (define *log2 (py-get numpy 'log2))
    (define *log1p (py-get numpy 'log1p))
    (define *logaddexp (py-get numpy 'logaddexp))
    (define *logaddexp2 (py-get numpy 'logaddexp2))

    (define *i0 (py-get numpy 'i0))
    (define *sinc (py-get numpy 'sinc))

    (define *signbit (py-get numpy 'signbit))
    (define *copysign (py-get numpy 'copysign))
    (define *frexp (py-get numpy 'frexp))
    (define *ldexp (py-get numpy 'ldexp))
    (define *nextafter (py-get numpy 'nextafter))
    (define *spacing (py-get numpy 'spacing))

    (define *lcm (py-get numpy 'lcm))
    (define *gcd (py-get numpy 'gcd))  

    (define *add (py-get numpy 'add))
    (define *subtract (py-get numpy 'subtract))
    (define *multiply (py-get numpy 'multiply))
    (define *divide (py-get numpy 'divide))
    (define *reciprocal (py-get numpy 'reciprocal))
    (define *power (py-get numpy 'power))
    (define *positive (py-get numpy 'positive))
    (define *true-divide (py-get numpy 'true_divide))
    (define *floor-divide (py-get numpy 'floor_divide))
    (define *float-power (py-get numpy 'float_power))
    (define *mod (py-get numpy 'mod))
    (define *fmod (py-get numpy 'fmod))
    (define *modf (py-get numpy 'modf))
    (define *remainder (py-get numpy 'remainder))
    (define *divmod (py-get numpy 'divmod))

    (define *angle (py-get numpy 'angle))
    (define *real (py-get numpy 'real))
    (define *imag (py-get numpy 'imag))
    (define *conj (py-get numpy 'conj))

    (define *convolve (py-get numpy 'convolve))
    (define *clip (py-get numpy 'clip))
    (define *sqrt (py-get numpy 'sqrt))
    (define *cbrt (py-get numpy 'cbrt))
    (define *square (py-get numpy 'square))
    (define *absolute (py-get numpy 'absolute))
    (define *fabs (py-get numpy 'fabs))
    (define *sign (py-get numpy 'sign))
    (define *heaviside (py-get numpy 'heaviside))
    (define *maximum (py-get numpy 'maximum))
    (define *minimum (py-get numpy 'minimum))
    (define *fmax (py-get numpy 'fmax))
    (define *fmin (py-get numpy 'fmin))
    (define *nan-to-num (py-get numpy 'nan_to_num))
    (define *real-if-close (py-get numpy 'real_if_close))
    (define *interp (py-get numpy 'interp))

    (define *amin (py-get numpy 'amin))
    (define *amax (py-get numpy 'amax))
    (define *ptp (py-get numpy 'ptp))
    (define *percentile (py-get numpy 'percentile))
    (define *median (py-get numpy 'median))
    (define *mean (py-get numpy 'mean))
    (define *average (py-get numpy 'average))
    (define *std (py-get numpy 'std))
    (define *var (py-get numpy 'var))
    (define *sort (py-get numpy 'sort))
    (define *argsort (py-get numpy 'argsort))
    (define *lexsort (py-get numpy 'lexsort))
    (define *msort (py-get numpy 'msort))
    (define *sort-complex (py-get numpy 'sort_complex))
    (define *partition (py-get numpy 'partition))
    (define *argpartition (py-get numpy 'argpartition))
    (define *argmax (py-get numpy 'argmax))
    (define *argmin (py-get numpy 'argmin))
    (define *nonzero (py-get numpy 'nonzero))
    (define *where (py-get numpy 'where))
    (define *extract (py-get numpy 'extract))

    (define *dot (py-get numpy 'dot))
    (define *vdot (py-get numpy 'vdot))
    (define *inner (py-get numpy 'inner))
    (define *matmul (py-get numpy 'matmul))

    (define *det (py-get linalg 'det))
    (define *solve (py-get linalg 'solve))
    (define *inv (py-get linalg 'inv))

    (define *fft (py-get fft 'fft))
    (define *ifft (py-get fft 'ifft))
    (define *fft2 (py-get fft 'fft2))
    (define *ifft2 (py-get fft 'ifft2))
    (define *fftn (py-get fft 'fftn))
    (define *ifftn (py-get fft 'ifftn))

    (define *rfft (py-get fft 'rfft))
    (define *irfft (py-get fft 'irfft))
    (define *rfft2 (py-get fft 'rfft2))
    (define *irfft2 (py-get fft 'irfft2))
    (define *rfftn (py-get fft 'rfftn))
    (define *irfftn (py-get fft 'irfftn))

    (define *hfft (py-get fft 'hfft))
    (define *ihfft (py-get fft 'ihfft))

    (define *fftfreq (py-get fft 'fftfreq))
    (define *rfftfreq (py-get fft 'rfftfreq))
    (define *fftshift (py-get fft 'fftshift))
    (define *ifftshift (py-get fft 'ifftshift))

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
            ((_ e1 e2 e3)(py-call *linspace e1 e2 e3))
            ((_ e1 e2 e3 (k v) ...)
                ((py-call* *linspace e1 e2 e3) 
                    (list (cons k v) ...)))))

    (define-syntax np-logspace
        (syntax-rules ()
            ((_ e)(py-call *logspace e))
            ((_ e (k v) ...)
                ((py-call* *logspace e) 
                    (list (cons k v) ...)))))




    (define np-sin (py-func numpy 'sin))
    (define np-tolist (py-func ndarray 'tolist))
    (define np-shape (py-func numpy 'shape))
    (define np-size (py-func numpy 'size))
    (define np-arange (py-func numpy 'arange))
    (define np-exp (py-func numpy 'exp))
    (define np-negative (py-func numpy 'negative))



)


