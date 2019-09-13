package com.example.prueba5lab4fragments

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
class Peluchito( var nombre: String, var Id: String, var cantidad: String, var precio: String) : Parcelable
