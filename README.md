# Notes

## Run
```
>> chmod +x run.sh
>> ./run.sh function/DefaultValueParameters.kt
```

## Kotlin Knowledge
### Top Level Properties
In Kotlin, properties that does not belong to class are called top-level properties.

### Init Block
The init block gets called immediately after the primary constructor but before the secondary constructor.

### Data Class
Data classes will automatically generate equals(), hashCode(), toString() and copy() methods.  
Data classes are primarily for classes that's going to behave as a data container.

### Inheritance
- Any is the super class of all classes in Kotlin. It is like Object in Java.
- All the classes are final, so extending classes is not allowed by default. To make a class inheritable, we need to use the open keyword.

### Object
This keyword allows us to create a singleton class.

### Companion Object
Kotlin does not have static keyword. Instead, it uses companion object to achieve the same goal.
