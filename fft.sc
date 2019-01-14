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






(library (numpy fft)
    (export
        ft
        )

    (import
        (chezscheme)
        (darkart py call)
        (only (numpy numpy) numpy))

    (define ft (py-get numpy 'fft))
    
    (define *fft (py-get ft 'fft))
    (define *ifft (py-get ft 'ifft))
    (define *fft2 (py-get ft 'fft2))
    (define *ifft2 (py-get ft 'ifft2))
    (define *fftn (py-get ft 'fftn))
    (define *ifftn (py-get ft 'ifftn))

    (define *rfft (py-get ft 'rfft))
    (define *irfft (py-get ft 'irfft))
    (define *rfft2 (py-get ft 'rfft2))
    (define *irfft2 (py-get ft 'irfft2))
    (define *rfftn (py-get ft 'rfftn))
    (define *irfftn (py-get ft 'irfftn))

    (define *hfft (py-get ft 'hfft))
    (define *ihfft (py-get ft 'ihfft))

    (define *fftfreq (py-get ft 'fftfreq))
    (define *rfftfreq (py-get ft 'rfftfreq))
    (define *fftshift (py-get ft 'fftshift))
    (define *ifftshift (py-get ft 'ifftshift))



)