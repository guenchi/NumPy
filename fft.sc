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
        fftlib
        )

    (import
        (chezscheme)
        (darkart py call)
        (only (numpy numpy) numpy))

    (define fftlib (py-get numpy 'fft))
    
    (define *fft (py-get fftlib 'fft))
    (define *ifft (py-get fftlib 'ifft))
    (define *fft2 (py-get fftlib 'fft2))
    (define *ifft2 (py-get fftlib 'ifft2))
    (define *fftn (py-get fftlib 'fftn))
    (define *ifftn (py-get fftlib 'ifftn))

    (define *rfft (py-get fftlib 'rfft))
    (define *irfft (py-get fftlib 'irfft))
    (define *rfft2 (py-get fftlib 'rfft2))
    (define *irfft2 (py-get fftlib 'irfft2))
    (define *rfftn (py-get fftlib 'rfftn))
    (define *irfftn (py-get fftlib 'irfftn))

    (define *hfft (py-get fftlib 'hfft))
    (define *ihfft (py-get fftlib 'ihfft))

    (define *fftfreq (py-get fftlib 'fftfreq))
    (define *rfftfreq (py-get fftlib 'rfftfreq))
    (define *fftshift (py-get fftlib 'fftshift))
    (define *ifftshift (py-get fftlib 'ifftshift))



)