@echo off

git add .
set /p input=������commit�����ƣ�

echo ����commit�ǣ�%input%

pause

git commit -m '%input%'


@echo on
git push origin main


pause