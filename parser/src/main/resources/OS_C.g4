/*
 [The "BSD licence"]
 Copyright (c) 2013 Sam Harwell
 All rights reserved.

 Redistribution and use in source and binary forms, with or without
 modification, are permitted provided that the following conditions
 are met:
 1. Redistributions of source code must retain the above copyright
    notice, this list of conditions and the following disclaimer.
 2. Redistributions in binary form must reproduce the above copyright
    notice, this list of conditions and the following disclaimer in the
    documentation and/or other materials provided with the distribution.
 3. The name of the author may not be used to endorse or promote products
    derived from this software without specific prior written permission.

 THIS SOFTWARE IS PROVIDED BY THE AUTHOR ``AS IS'' AND ANY EXPRESS OR
 IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES
 OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED.
 IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR ANY DIRECT, INDIRECT,
 INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT
 NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
 DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
 THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF
 THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
*/

grammar OS_C;

compilationUnit
    :   translationUnit? EOF
    ;

translationUnit
    :   externalDeclaration
    |   translationUnit externalDeclaration
    ;

externalDeclaration
    :   functionDefinition
    |   declaration
    |   ';' // stray ;
    ;

functionDefinition
    :   declarator compoundStatement
    ;

declarator
    :   Identifier '(' ')'
    ;

compoundStatement
    :   '{' blockItemList? '}'
    ;

blockItemList
    :   blockItem
    |   blockItemList blockItem
    ;

blockItem
    :   declaration
    |   statement
    ;

declaration
    :   TypeSpecifier identifierList ';'
    ;

identifierList
    :   Identifier
    |   identifierList ',' Identifier
    ;

statement
    :   assignmentExpression ';'
    |   parallelBlock ';'
    |   ioOperation ';'
    ;

assignmentExpression
    :   Identifier '=' rExpression
    ;

rExpression
    :   rValue
    |   additiveExpression
    ;

rValue
    :   Identifier
    |   Constant
    ;

additiveExpression
    :   multiplicativeExpression
    |   additiveExpression '+' multiplicativeExpression
    |   additiveExpression '-' multiplicativeExpression
    ;

multiplicativeExpression
    :   atomicExpression
    |   multiplicativeExpression '*' atomicExpression
    |   multiplicativeExpression '/' atomicExpression
    |   multiplicativeExpression '%' atomicExpression
    ;

atomicExpression
    :   rValue
    |   '(' rExpression ')'
    ;

parallelBlock
    :   StartParallel parallelItemList EndParallel
    ;

parallelItemList
    :   parallelItem
    |   parallelItemList parallelItem
    ;

parallelItem
    :   statement
    ;

ioOperation
    :   ioFunctionName '(' identifierList ')'
    ;

TypeSpecifier
    :   ('input_var'
    | 'internal_var')
    ;

ioFunctionName
    :   'read'
    |   'write'
    ;

StartParallel
    : 'cobegin'
    ;

EndParallel
    : 'coend'
    ;

Identifier
    :   Nondigit
        (   Nondigit
        |   Digit
        )*
    ;

Constant
    :   IntegerConstant
    |   FloatingConstant
    ;

fragment
IntegerConstant
    :   NonzeroDigit Digit*
    ;

fragment
NonzeroDigit
    :   [1-9]
    ;

fragment
Digit
    :   [0-9]
    ;

fragment
FloatingConstant
    :   FractionalConstant ExponentPart?
    |   DigitSequence ExponentPart
    ;

fragment
FractionalConstant
    :   DigitSequence? '.' DigitSequence
    |   DigitSequence '.'
    ;

fragment
ExponentPart
    :   'e' Sign? DigitSequence
    |   'E' Sign? DigitSequence
    ;

fragment
Sign
    :   '+' | '-'
    ;

fragment
DigitSequence
    :   Digit+
    ;

fragment
Nondigit
    :   [a-zA-Z_]
    ;

Whitespace
    :   [ \t]+
        -> skip
    ;

Newline
    :   (   '\r' '\n'?
        |   '\n'
        )
        -> skip
    ;

BlockComment
    :   '/*' .*? '*/'
        -> skip
    ;

LineComment
    :   '//' ~[\r\n]*
        -> skip
    ;
