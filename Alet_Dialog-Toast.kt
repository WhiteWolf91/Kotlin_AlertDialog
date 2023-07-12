
val alert = AlertDialog.Builder(this@MainActivity)
        alert.setTitle("Save")
        alert.setMessage("Kaydedildi")
        alert.setPositiveButton("saved") {p0, p1 ->
            Toast.makeText(this@MainActivity,"Saved",Toast.LENGTH_SHORT).show()
        }
        alert.setIcon(R.drawable.ic_launcher_background)
        alert.show()
