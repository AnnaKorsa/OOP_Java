package HW7.model;

import java.text.NumberFormat;

public class ComplexNumber {
    private Double real;
    private Double imaginary;

    public ComplexNumber(Double real, Double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public Double getReal() {
        return real;
    }

    public Double getImag() {
        return imaginary;
    }

    public ComplexNumber sum(ComplexNumber num) {
        real += num.getReal();
        imaginary += num.getImag();

        return this;
    }

    public ComplexNumber multi(ComplexNumber num) {
        double temp = real * num.getReal() - imaginary * num.getImag();
        imaginary = real * num.getImag() + imaginary * num.getReal();
        real = temp;

        return this;
    }

    public ComplexNumber div(ComplexNumber num) {
        double denominator = num.getReal() * num.getReal() + num.getImag() * num.getImag();

        if (denominator == 0) {
            real = imaginary = 0.;
        } else {
            double temp = (real * num.getReal() + imaginary * num.getImag()) / denominator;
            imaginary = (imaginary * num.getReal() - real * num.getImag()) / denominator;
            real = temp;
        }

        return this;
    }

    @Override
    public String toString() {
        NumberFormat nf = NumberFormat.getInstance();

        if (real == 0) {
            return nf.format(imaginary) + "i";
        } else if (imaginary == 0) {
            return nf.format(real);
        } else if (imaginary > 0) {
            return nf.format(real) + " + " + nf.format(imaginary) + "i";
        } else {
            return nf.format(real) + nf.format(imaginary) + "i";
        }
    }
}
