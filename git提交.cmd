@echo off

git add .
set /p input=������commit�����ƣ�

@echo ������commit������:
echo ����commit��%input%

git commit -m '%input%'


@echo on
git push origin main


pause