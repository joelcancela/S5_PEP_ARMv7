# ARMv7 RAM & ROM generator for Logisim

This project allows to generate configuration files for RAM and ROM components.

It was made to support some ARMv7 16bits instructions [more details here](doc/instructions.md).

## Prerequisites

* Maven
* Java

## Creating configuration files (.ini)

You can create a RAM file or a ROM file or even both at once, you only need to write a textual file for each type maching the following requirements :

### ROM file

* The file must have only one instruction per line
* The immediate must be prefixed with `#`
* The operands are separated with `,` and registers are prefixed with `R`

An example can be seen [here](examples/prog.s).

### RAM file

* The RAM variables must be written in decimal base, separated with a space.

An example can be seen [here](examples/vars.ini).

### Launch

* Use the `-rom` argument to specify the program file to interpret, the output file will be called `rom.ini`.

* Use the `-ram` argument to specify the variables file to interpret, the output file will be called `ram.ini`.

### How to launch

`mvn -q exec:java -Dexec.mainClass="Main" -Dexec.args="`**{args}**`"`

Example

`mvn -q exec:java -Dexec.mainClass="Main" -Dexec.args="-ram examples/vars.ini -rom examples/prog.s"`

### Outputs examples

* RAM example

```ini
v2.0 raw
1 3 2 4
```

* ROM example

```ini
v2.0 raw
9800 9900 1A08 D005
9A02 9801 00C9 4308
```
