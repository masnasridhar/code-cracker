################################################################################
# Automatically-generated file. Do not edit!
################################################################################

# Add inputs and outputs from these tool invocations to the build variables 
C_SRCS += \
../AmstrongNumber.c \
../AreaOfCircle.c \
../AreaOfTriangle.c \
../EvenOrOdd.c \
../Factorial.c \
../FibonaaciSeries.c \
../GreaterNumberOfGiven.c \
../LargestAndSmallest.c \
../Palindram.c \
../Prime.c \
../ReverseNumber.c \
../StringPallindram.c \
../StringReverse.c \
../SumOfDigitsOfNumber.c \
../SwappingTwoNumbers.c 

OBJS += \
./AmstrongNumber.o \
./AreaOfCircle.o \
./AreaOfTriangle.o \
./EvenOrOdd.o \
./Factorial.o \
./FibonaaciSeries.o \
./GreaterNumberOfGiven.o \
./LargestAndSmallest.o \
./Palindram.o \
./Prime.o \
./ReverseNumber.o \
./StringPallindram.o \
./StringReverse.o \
./SumOfDigitsOfNumber.o \
./SwappingTwoNumbers.o 

C_DEPS += \
./AmstrongNumber.d \
./AreaOfCircle.d \
./AreaOfTriangle.d \
./EvenOrOdd.d \
./Factorial.d \
./FibonaaciSeries.d \
./GreaterNumberOfGiven.d \
./LargestAndSmallest.d \
./Palindram.d \
./Prime.d \
./ReverseNumber.d \
./StringPallindram.d \
./StringReverse.d \
./SumOfDigitsOfNumber.d \
./SwappingTwoNumbers.d 


# Each subdirectory must supply rules for building sources it contributes
%.o: ../%.c
	@echo 'Building file: $<'
	@echo 'Invoking: Cygwin C Compiler'
	gcc -O0 -g3 -Wall -c -fmessage-length=0 -MMD -MP -MF"$(@:%.o=%.d)" -MT"$(@:%.o=%.d)" -o "$@" "$<"
	@echo 'Finished building: $<'
	@echo ' '


